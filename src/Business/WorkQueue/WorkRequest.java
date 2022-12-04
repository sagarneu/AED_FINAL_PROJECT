/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author sagred
 */
public abstract class WorkRequest {

    private String wrMsg;
    private UserAccount sender;
    private UserAccount receiver;
    private String status;
    private Date requestDate;
    private Date resolveDate;
    private String testType = " ";

    public String getTestType() {
        return testType;
    }

    public void setTestType(String bloodTestType) {
        this.testType = bloodTestType;
    }

    public WorkRequest() {
        requestDate = new Date();
    }

    public String getWrMsg() {
        return wrMsg;
    }

    public void setWrMsg(String wrMsg) {
        this.wrMsg = wrMsg;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }
}
