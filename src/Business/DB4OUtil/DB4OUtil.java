package Business.DB4OUtil;

import Business.EcoSystem;
import Business.SystemConfig;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ta.TransparentPersistenceSupport;
import java.nio.file.Paths;

/**
 *
 * @author narasimhatejareddy
 */
public class DB4OUtil {

    private static final String FILENAME = Paths.get("Databank.db4o").toAbsolutePath().toString();// path to the data store
    private static DB4OUtil dB4OUtil;
    
    public synchronized static DB4OUtil getInstance(){
        if (dB4OUtil == null){
            dB4OUtil = new DB4OUtil();
        }
        return dB4OUtil;
    }

    protected synchronized static void shutdown(ObjectContainer conn) {
        if (conn != null) {
            conn.close();
        }
    }

    private ObjectContainer createConnection() {
        try {

            EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
             ObjectContainer db = Db4oEmbedded.openFile(config, FILENAME);
            config.common().add(new TransparentPersistenceSupport());
            config.common().activationDepth(Integer.MAX_VALUE);
            config.common().updateDepth(Integer.MAX_VALUE);

            config.common().objectClass(EcoSystem.class).cascadeOnUpdate(true); 

           
            return db;
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
        return null;
    }

    public synchronized void storeSystem(EcoSystem ecosystem) {
        ObjectContainer conn = createConnection();
        conn.store(ecosystem);
        conn.commit();
        conn.close();
    }
    
    public EcoSystem retrieveSystem(){
        ObjectContainer conn = createConnection();
        ObjectSet<EcoSystem> ecosystems = conn.query(EcoSystem.class); 
        EcoSystem ecosystem;
        if (ecosystems.isEmpty()){
            ecosystem = SystemConfig.configure();  
        }
        else{
            ecosystem = ecosystems.get(ecosystems.size() - 1);
        }
        conn.close();
        return ecosystem;
    }
}
