
package org.omnirom.omnimost;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Property2 {

    private String id;
    private Integer createAt;
    private Integer updateAt;
    private Integer deleteAt;
    private String userId;
    private String channelId;
    private String rootId;
    private String parentId;
    private String originalId;
    private String message;
    private String type;
    private Props_ props;
    private String hashtag;
    private List<String> filenames = new ArrayList<String>();
    private String pendingPostId;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Property2() {
    }

    /**
     *
     * @param message
     * @param id
     * @param parentId
     * @param updateAt
     * @param createAt
     * @param deleteAt
     * @param rootId
     * @param channelId
     * @param filenames
     * @param originalId
     * @param userId
     * @param hashtag
     * @param type
     * @param props
     * @param pendingPostId
     */
    public Property2(String id, Integer createAt, Integer updateAt, Integer deleteAt, String userId, String channelId, String rootId, String parentId, String originalId, String message, String type, Props_ props, String hashtag, List<String> filenames, String pendingPostId) {
        this.id = id;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.deleteAt = deleteAt;
        this.userId = userId;
        this.channelId = channelId;
        this.rootId = rootId;
        this.parentId = parentId;
        this.originalId = originalId;
        this.message = message;
        this.type = type;
        this.props = props;
        this.hashtag = hashtag;
        this.filenames = filenames;
        this.pendingPostId = pendingPostId;
    }

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

    public Property2 withId(String id) {
        this.id = id;
        return this;
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

    public Property2 withCreateAt(Integer createAt) {
        this.createAt = createAt;
        return this;
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

    public Property2 withUpdateAt(Integer updateAt) {
        this.updateAt = updateAt;
        return this;
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

    public Property2 withDeleteAt(Integer deleteAt) {
        this.deleteAt = deleteAt;
        return this;
    }

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

    public Property2 withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     *
     * @return
     *     The channelId
     */
    public String getChannelId() {
        return channelId;
    }

    /**
     *
     * @param channelId
     *     The channel_id
     */
    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public Property2 withChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }

    /**
     *
     * @return
     *     The rootId
     */
    public String getRootId() {
        return rootId;
    }

    /**
     *
     * @param rootId
     *     The root_id
     */
    public void setRootId(String rootId) {
        this.rootId = rootId;
    }

    public Property2 withRootId(String rootId) {
        this.rootId = rootId;
        return this;
    }

    /**
     *
     * @return
     *     The parentId
     */
    public String getParentId() {
        return parentId;
    }

    /**
     *
     * @param parentId
     *     The parent_id
     */
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public Property2 withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     *
     * @return
     *     The originalId
     */
    public String getOriginalId() {
        return originalId;
    }

    /**
     *
     * @param originalId
     *     The original_id
     */
    public void setOriginalId(String originalId) {
        this.originalId = originalId;
    }

    public Property2 withOriginalId(String originalId) {
        this.originalId = originalId;
        return this;
    }

    /**
     *
     * @return
     *     The message
     */
    public String getMessage() {
        return message;
    }

    /**
     *
     * @param message
     *     The message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    public Property2 withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     *
     * @return
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     *     The type
     */
    public void setType(String type) {
        this.type = type;
    }

    public Property2 withType(String type) {
        this.type = type;
        return this;
    }

    /**
     *
     * @return
     *     The props
     */
    public Props_ getProps() {
        return props;
    }

    /**
     *
     * @param props
     *     The props
     */
    public void setProps(Props_ props) {
        this.props = props;
    }

    public Property2 withProps(Props_ props) {
        this.props = props;
        return this;
    }

    /**
     *
     * @return
     *     The hashtag
     */
    public String getHashtag() {
        return hashtag;
    }

    /**
     *
     * @param hashtag
     *     The hashtag
     */
    public void setHashtag(String hashtag) {
        this.hashtag = hashtag;
    }

    public Property2 withHashtag(String hashtag) {
        this.hashtag = hashtag;
        return this;
    }

    /**
     *
     * @return
     *     The filenames
     */
    public List<String> getFilenames() {
        return filenames;
    }

    /**
     *
     * @param filenames
     *     The filenames
     */
    public void setFilenames(List<String> filenames) {
        this.filenames = filenames;
    }

    public Property2 withFilenames(List<String> filenames) {
        this.filenames = filenames;
        return this;
    }

    /**
     *
     * @return
     *     The pendingPostId
     */
    public String getPendingPostId() {
        return pendingPostId;
    }

    /**
     *
     * @param pendingPostId
     *     The pending_post_id
     */
    public void setPendingPostId(String pendingPostId) {
        this.pendingPostId = pendingPostId;
    }

    public Property2 withPendingPostId(String pendingPostId) {
        this.pendingPostId = pendingPostId;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Property2 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
