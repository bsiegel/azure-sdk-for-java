// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob.implementation;

import com.azure.core.annotation.ServiceClientBuilder;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.storage.blob.models.PathRenameMode;

/**
 * A builder for creating a new instance of the AzureBlobStorage type.
 */
@ServiceClientBuilder(serviceClients = AzureBlobStorageImpl.class)
public final class AzureBlobStorageBuilder {
    /*
     * The URL of the service account, container, or blob that is the targe of the desired operation.
     */
    private String url;

    /**
     * Sets The URL of the service account, container, or blob that is the targe of the desired operation.
     *
     * @param url the url value.
     * @return the AzureBlobStorageBuilder.
     */
    public AzureBlobStorageBuilder url(String url) {
        this.url = url;
        return this;
    }

    /*
     * Specifies the version of the operation to use for this request.
     */
    private String version;

    /**
     * Sets Specifies the version of the operation to use for this request.
     *
     * @param version the version value.
     * @return the AzureBlobStorageBuilder.
     */
    public AzureBlobStorageBuilder version(String version) {
        this.version = version;
        return this;
    }

    /*
     * Determines the behavior of the rename operation. Possible values include: 'legacy', 'posix'
     */
    private PathRenameMode pathRenameMode;

    /**
     * Sets Determines the behavior of the rename operation. Possible values include: 'legacy', 'posix'.
     *
     * @param pathRenameMode the pathRenameMode value.
     * @return the AzureBlobStorageBuilder.
     */
    public AzureBlobStorageBuilder pathRenameMode(PathRenameMode pathRenameMode) {
        this.pathRenameMode = pathRenameMode;
        return this;
    }

    /*
     * The HTTP pipeline to send requests through
     */
    private HttpPipeline pipeline;

    /**
     * Sets The HTTP pipeline to send requests through.
     *
     * @param pipeline the pipeline value.
     * @return the AzureBlobStorageBuilder.
     */
    public AzureBlobStorageBuilder pipeline(HttpPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }

    /**
     * Builds an instance of AzureBlobStorageImpl with the provided parameters.
     *
     * @return an instance of AzureBlobStorageImpl.
     */
    public AzureBlobStorageImpl build() {
        if (pipeline == null) {
            this.pipeline = new HttpPipelineBuilder().policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy()).build();
        }
        AzureBlobStorageImpl client = new AzureBlobStorageImpl(pipeline);
        if (this.url != null) {
            client.setUrl(this.url);
        }
        if (this.version != null) {
            client.setVersion(this.version);
        } else {
            client.setVersion("2020-06-12");
        }
        if (this.pathRenameMode != null) {
            client.setPathRenameMode(this.pathRenameMode);
        }
        return client;
    }
}
