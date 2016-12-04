
package org.omnirom.omnimost;

import java.util.HashMap;
import java.util.Map;

public class UserCreatedSuccess {

    private String id;
    private Integer createAt;
    private Integer updateAt;
    private Integer deleteAt;
    private String username;
    private String firstName;
    private String lastName;
    private String nickname;
    private String email;
    private Boolean emailVerified;
    private String password;
    private String authData;
    private String authService;
    private String roles;
    private String locale;
    private NotifyProps notifyProps;
    private Props props;
    private Integer lastPasswordUpdate;
    private Integer lastPictureUpdate;
    private Integer failedAttempts;
    private Boolean mfaActive;
    private String mfaSecret;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The createAt
     */
    public Integer getCreateAt() {
        return createAt;
    }

    /**
     * 
     * @param createAt
     *     The create_at
     */
    public void setCreateAt(Integer createAt) {
        this.createAt = createAt;
    }

    /**
     * 
     * @return
     *     The updateAt
     */
    public Integer getUpdateAt() {
        return updateAt;
    }

    /**
     * 
     * @param updateAt
     *     The update_at
     */
    public void setUpdateAt(Integer updateAt) {
        this.updateAt = updateAt;
    }

    /**
     * 
     * @return
     *     The deleteAt
     */
    public Integer getDeleteAt() {
        return deleteAt;
    }

    /**
     * 
     * @param deleteAt
     *     The delete_at
     */
    public void setDeleteAt(Integer deleteAt) {
        this.deleteAt = deleteAt;
    }

    /**
     * 
     * @return
     *     The username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 
     * @param username
     *     The username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 
     * @return
     *     The firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * 
     * @param firstName
     *     The first_name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * 
     * @return
     *     The lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * 
     * @param lastName
     *     The last_name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * 
     * @return
     *     The nickname
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 
     * @param nickname
     *     The nickname
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * 
     * @return
     *     The email
     */
    public String getEmail() {
        return email;
    }

    /**
     * 
     * @param email
     *     The email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 
     * @return
     *     The emailVerified
     */
    public Boolean getEmailVerified() {
        return emailVerified;
    }

    /**
     * 
     * @param emailVerified
     *     The email_verified
     */
    public void setEmailVerified(Boolean emailVerified) {
        this.emailVerified = emailVerified;
    }

    /**
     * 
     * @return
     *     The password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 
     * @param password
     *     The password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 
     * @return
     *     The authData
     */
    public String getAuthData() {
        return authData;
    }

    /**
     * 
     * @param authData
     *     The auth_data
     */
    public void setAuthData(String authData) {
        this.authData = authData;
    }

    /**
     * 
     * @return
     *     The authService
     */
    public String getAuthService() {
        return authService;
    }

    /**
     * 
     * @param authService
     *     The auth_service
     */
    public void setAuthService(String authService) {
        this.authService = authService;
    }

    /**
     * 
     * @return
     *     The roles
     */
    public String getRoles() {
        return roles;
    }

    /**
     * 
     * @param roles
     *     The roles
     */
    public void setRoles(String roles) {
        this.roles = roles;
    }

    /**
     * 
     * @return
     *     The locale
     */
    public String getLocale() {
        return locale;
    }

    /**
     * 
     * @param locale
     *     The locale
     */
    public void setLocale(String locale) {
        this.locale = locale;
    }

    /**
     * 
     * @return
     *     The notifyProps
     */
    public NotifyProps getNotifyProps() {
        return notifyProps;
    }

    /**
     * 
     * @param notifyProps
     *     The notify_props
     */
    public void setNotifyProps(NotifyProps notifyProps) {
        this.notifyProps = notifyProps;
    }

    /**
     * 
     * @return
     *     The props
     */
    public Props getProps() {
        return props;
    }

    /**
     * 
     * @param props
     *     The props
     */
    public void setProps(Props props) {
        this.props = props;
    }

    /**
     * 
     * @return
     *     The lastPasswordUpdate
     */
    public Integer getLastPasswordUpdate() {
        return lastPasswordUpdate;
    }

    /**
     * 
     * @param lastPasswordUpdate
     *     The last_password_update
     */
    public void setLastPasswordUpdate(Integer lastPasswordUpdate) {
        this.lastPasswordUpdate = lastPasswordUpdate;
    }

    /**
     * 
     * @return
     *     The lastPictureUpdate
     */
    public Integer getLastPictureUpdate() {
        return lastPictureUpdate;
    }

    /**
     * 
     * @param lastPictureUpdate
     *     The last_picture_update
     */
    public void setLastPictureUpdate(Integer lastPictureUpdate) {
        this.lastPictureUpdate = lastPictureUpdate;
    }

    /**
     * 
     * @return
     *     The failedAttempts
     */
    public Integer getFailedAttempts() {
        return failedAttempts;
    }

    /**
     * 
     * @param failedAttempts
     *     The failed_attempts
     */
    public void setFailedAttempts(Integer failedAttempts) {
        this.failedAttempts = failedAttempts;
    }

    /**
     * 
     * @return
     *     The mfaActive
     */
    public Boolean getMfaActive() {
        return mfaActive;
    }

    /**
     * 
     * @param mfaActive
     *     The mfa_active
     */
    public void setMfaActive(Boolean mfaActive) {
        this.mfaActive = mfaActive;
    }

    /**
     * 
     * @return
     *     The mfaSecret
     */
    public String getMfaSecret() {
        return mfaSecret;
    }

    /**
     * 
     * @param mfaSecret
     *     The mfa_secret
     */
    public void setMfaSecret(String mfaSecret) {
        this.mfaSecret = mfaSecret;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
