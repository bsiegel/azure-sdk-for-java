/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Application stack major version.
 */
public class StackMajorVersion {
    /**
     * Application stack major version (display only).
     */
    @JsonProperty(value = "displayVersion")
    private String displayVersion;

    /**
     * Application stack major version (runtime only).
     */
    @JsonProperty(value = "runtimeVersion")
    private String runtimeVersion;

    /**
     * &lt;code&gt;true&lt;/code&gt; if this is the default major version;
     * otherwise, &lt;code&gt;false&lt;/code&gt;.
     */
    @JsonProperty(value = "isDefault")
    private Boolean isDefault;

    /**
     * Minor versions associated with the major version.
     */
    @JsonProperty(value = "minorVersions")
    private List<StackMinorVersion> minorVersions;

    /**
     * &lt;code&gt;true&lt;/code&gt; if this supports Application Insights;
     * otherwise, &lt;code&gt;false&lt;/code&gt;.
     */
    @JsonProperty(value = "applicationInsights")
    private Boolean applicationInsights;

    /**
     * Get application stack major version (display only).
     *
     * @return the displayVersion value
     */
    public String displayVersion() {
        return this.displayVersion;
    }

    /**
     * Set application stack major version (display only).
     *
     * @param displayVersion the displayVersion value to set
     * @return the StackMajorVersion object itself.
     */
    public StackMajorVersion withDisplayVersion(String displayVersion) {
        this.displayVersion = displayVersion;
        return this;
    }

    /**
     * Get application stack major version (runtime only).
     *
     * @return the runtimeVersion value
     */
    public String runtimeVersion() {
        return this.runtimeVersion;
    }

    /**
     * Set application stack major version (runtime only).
     *
     * @param runtimeVersion the runtimeVersion value to set
     * @return the StackMajorVersion object itself.
     */
    public StackMajorVersion withRuntimeVersion(String runtimeVersion) {
        this.runtimeVersion = runtimeVersion;
        return this;
    }

    /**
     * Get &lt;code&gt;true&lt;/code&gt; if this is the default major version; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the isDefault value
     */
    public Boolean isDefault() {
        return this.isDefault;
    }

    /**
     * Set &lt;code&gt;true&lt;/code&gt; if this is the default major version; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @param isDefault the isDefault value to set
     * @return the StackMajorVersion object itself.
     */
    public StackMajorVersion withIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    /**
     * Get minor versions associated with the major version.
     *
     * @return the minorVersions value
     */
    public List<StackMinorVersion> minorVersions() {
        return this.minorVersions;
    }

    /**
     * Set minor versions associated with the major version.
     *
     * @param minorVersions the minorVersions value to set
     * @return the StackMajorVersion object itself.
     */
    public StackMajorVersion withMinorVersions(List<StackMinorVersion> minorVersions) {
        this.minorVersions = minorVersions;
        return this;
    }

    /**
     * Get &lt;code&gt;true&lt;/code&gt; if this supports Application Insights; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the applicationInsights value
     */
    public Boolean applicationInsights() {
        return this.applicationInsights;
    }

    /**
     * Set &lt;code&gt;true&lt;/code&gt; if this supports Application Insights; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @param applicationInsights the applicationInsights value to set
     * @return the StackMajorVersion object itself.
     */
    public StackMajorVersion withApplicationInsights(Boolean applicationInsights) {
        this.applicationInsights = applicationInsights;
        return this;
    }

}
