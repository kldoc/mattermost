
package org.omnirom.omnimost;

import java.util.HashMap;
import java.util.Map;

public class SearchUsers {

    private String term;
    private String teamId;
    private String inChannelId;
    private String notInChannelId;
    private Boolean allowInactive;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The term
     */
    public String getTerm() {
        return term;
    }

    /**
     * 
     * @param term
     *     The term
     */
    public void setTerm(String term) {
        this.term = term;
    }

    /**
     * 
     * @return
     *     The teamId
     */
    public String getTeamId() {
        return teamId;
    }

    /**
     * 
     * @param teamId
     *     The team_id
     */
    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    /**
     * 
     * @return
     *     The inChannelId
     */
    public String getInChannelId() {
        return inChannelId;
    }

    /**
     * 
     * @param inChannelId
     *     The in_channel_id
     */
    public void setInChannelId(String inChannelId) {
        this.inChannelId = inChannelId;
    }

    /**
     * 
     * @return
     *     The notInChannelId
     */
    public String getNotInChannelId() {
        return notInChannelId;
    }

    /**
     * 
     * @param notInChannelId
     *     The not_in_channel_id
     */
    public void setNotInChannelId(String notInChannelId) {
        this.notInChannelId = notInChannelId;
    }

    /**
     * 
     * @return
     *     The allowInactive
     */
    public Boolean getAllowInactive() {
        return allowInactive;
    }

    /**
     * 
     * @param allowInactive
     *     The allow_inactive
     */
    public void setAllowInactive(Boolean allowInactive) {
        this.allowInactive = allowInactive;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
