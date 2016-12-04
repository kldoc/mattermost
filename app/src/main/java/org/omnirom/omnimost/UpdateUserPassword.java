
package org.omnirom.omnimost;

import java.util.HashMap;
import java.util.Map;

public class UpdateUserPassword {

    private String userId;
    private String currentPassword;
    private String newPassword;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 
     * @param userId
     *     The user_id
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 
     * @return
     *     The currentPassword
     */
    public String getCurrentPassword() {
        return currentPassword;
    }

    /**
     * 
     * @param currentPassword
     *     The current_password
     */
    public void setCurrentPassword(String currentPassword) {
        this.currentPassword = currentPassword;
    }

    /**
     * 
     * @return
     *     The newPassword
     */
    public String getNewPassword() {
        return newPassword;
    }

    /**
     * 
     * @param newPassword
     *     The new_password
     */
    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
