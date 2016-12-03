package org.omnirom.omnimost;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GetChannelPosts {

    private List<String> order = new ArrayList<String>();
    private Posts posts;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public GetChannelPosts() {
    }

    /**
     *
     * @param order
     * @param posts
     */
    public GetChannelPosts(List<String> order, Posts posts) {
        this.order = order;
        this.posts = posts;
    }

    /**
     *
     * @return
     * The order
     */
    public List<String> getOrder() {
        return order;
    }

    /**
     *
     * @param order
     * The order
     */
    public void setOrder(List<String> order) {
        this.order = order;
    }

    public GetChannelPosts withOrder(List<String> order) {
        this.order = order;
        return this;
    }

    /**
     *
     * @return
     * The posts
     */
    public Posts getPosts() {
        return posts;
    }

    /**
     *
     * @param posts
     * The posts
     */
    public void setPosts(Posts posts) {
        this.posts = posts;
    }

    public GetChannelPosts withPosts(Posts posts) {
        this.posts = posts;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public GetChannelPosts withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}