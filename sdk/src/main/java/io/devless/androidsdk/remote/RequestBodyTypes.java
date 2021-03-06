package io.devless.androidsdk.remote;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by bubu on 10/3/16.
 */

public class RequestBodyTypes {

    public static class UpdatePayload {

        @SerializedName("resource")
        @Expose
        private List<UpdateResource> resource = new ArrayList<UpdateResource>();

        /**
         * @return The updateResource
         */
        public List<UpdateResource> getUpdateResource() {
            return resource;
        }

        /**
         * @param updateResource The updateResource
         */
        public void setUpdateResource(List<UpdateResource> updateResource) {
            this.resource = updateResource;
        }

    }

    public static class DeletePayload {

        @SerializedName("resource")
        @Expose
        private List<DeleteResource> resource = new ArrayList<DeleteResource>();

        /**
         * @return The updateResource
         */
        public List<DeleteResource> getDeleteResource() {
            return resource;
        }

        public void setDeleteResource(List<DeleteResource> deleteResource) {
            this.resource = deleteResource;
        }

    }


    public static class UpdateParam {

        @SerializedName("where")
        @Expose
        private String where;
        @SerializedName("data")
        @Expose
        private List<Map<String, String>> data = new ArrayList<>();

        /**
         * @return The where
         */
        public String getWhere() {
            return where;
        }

        /**
         * @param where The where
         */
        public void setWhere(String where) {
            this.where = where;
        }

        /**
         * @return The data
         */
        public List<Map<String, String>> getData() {
            return data;
        }

        /**
         * @param data The data
         */
        public void setData(List<Map<String, String>> data) {
            this.data = data;
        }
    }

    public static class UpdateResource {

        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("params")
        @Expose
        private List<UpdateParam> params = new ArrayList<>();

        /**
         * @return The name
         */
        public String getName() {
            return name;
        }

        /**
         * @param name The name
         */
        public void setName(String name) {
            this.name = name;
        }

        /**
         * @return The params
         */
        public List<UpdateParam> getParams() {
            return params;
        }

        /**
         * @param params The params
         */
        public void setParams(List<UpdateParam> params) {
            this.params = params;
        }
    }

    public static class DeleteParam {

        @SerializedName("delete")
        @Expose
        private boolean delete;

        @SerializedName("where")
        @Expose
        private String where;

        /**
         * @return The where
         */
        public Boolean getDelete() {
            return delete;
        }

        /**
         * @param where The where
         */
        public void setWhere(String where) {
            this.where = where;
        }

        /**
         * @return The data
         */
        public String getWhere() {
            return where;
        }

        /**
         * @param data The data
         */
        public void setDelete(Boolean data) {
            this.delete = data;
        }
    }

    public static class DeleteResource {

        @SerializedName("name")
        @Expose
        private String name;

        @SerializedName("params")
        @Expose
        private List<DeleteParam> params = new ArrayList<DeleteParam>();

        /**
         * @param name The name
         */
        public void setName(String name) {
            this.name = name;
        }

        public String  getName() {
            return name;
        }

        /**
         * @return The params
         */
        public List<DeleteParam> getDeleteParams() {
            return params;
        }

        public void setDeleteParams(List<DeleteParam> params) {
            this.params = params;
        }
    }
}
