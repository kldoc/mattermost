package org.omnirom.omnimost;

import java.util.HashMap;
import java.util.Map;

public class CreateUser {

    private String email;
    private String username;
    private String firstName;
    private String lastName;
    private String nickname;
    private String password;
    private String locale;
    private Props props;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public CreateUser() {
    }

    /**
     *
     * @param lastName
     * @param username
     * @param nickname
     * @param email
     * @param locale
     * @param firstName
     * @param password
     * @param props
     */
    public CreateUser(String email, String username, String firstName, String lastName, String nickname, String password, String locale, Props props) {
        this.email = email;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickname = nickname;
        this.password = password;
        this.locale = locale;
        this.props = props;
    }

    /**
     *
     * @return
     * The email
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email
     * The email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    public CreateUser withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     *
     * @return
     * The username
     */
    public String getUsername() {
        return username;
    }

    /**
     *
     * @param username
     * The username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    public CreateUser withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     *
     * @return
     * The firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     *
     * @param firstName
     * The first_name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public CreateUser withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     *
     * @return
     * The lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     *
     * @param lastName
     * The last_name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public CreateUser withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     *
     * @return
     * The nickname
     */
    public String getNickname() {
        return nickname;
    }

    /**
     *
     * @param nickname
     * The nickname
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public CreateUser withNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    /**
     *
     * @return
     * The password
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @param password
     * The password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    public CreateUser withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     *
     * @return
     * The locale
     */
    public String getLocale() {
        return locale;
    }

    /**
     *
     * @param locale
     * The locale
     */
    public void setLocale(String locale) {
        this.locale = locale;
    }

    public CreateUser withLocale(String locale) {
        this.locale = locale;
        return this;
    }

    /**
     *
     * @return
     * The props
     */
    public Props getProps() {
        return props;
    }

    /**
     *
     * @param props
     * The props
     */
    public void setProps(Props props) {
        this.props = props;
    }

    public CreateUser withProps(Props props) {
        this.props = props;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public CreateUser withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}