/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.streamanalytics.v2020_03_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes one input parameter of a function.
 */
public class FunctionInput {
    /**
     * The (Azure Stream Analytics supported) data type of the function input
     * parameter. A list of valid Azure Stream Analytics data types are
     * described at
     * https://msdn.microsoft.com/en-us/library/azure/dn835065.aspx.
     */
    @JsonProperty(value = "dataType")
    private String dataType;

    /**
     * A flag indicating if the parameter is a configuration parameter. True if
     * this input parameter is expected to be a constant. Default is false.
     */
    @JsonProperty(value = "isConfigurationParameter")
    private Boolean isConfigurationParameter;

    /**
     * Get the (Azure Stream Analytics supported) data type of the function input parameter. A list of valid Azure Stream Analytics data types are described at https://msdn.microsoft.com/en-us/library/azure/dn835065.aspx.
     *
     * @return the dataType value
     */
    public String dataType() {
        return this.dataType;
    }

    /**
     * Set the (Azure Stream Analytics supported) data type of the function input parameter. A list of valid Azure Stream Analytics data types are described at https://msdn.microsoft.com/en-us/library/azure/dn835065.aspx.
     *
     * @param dataType the dataType value to set
     * @return the FunctionInput object itself.
     */
    public FunctionInput withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * Get a flag indicating if the parameter is a configuration parameter. True if this input parameter is expected to be a constant. Default is false.
     *
     * @return the isConfigurationParameter value
     */
    public Boolean isConfigurationParameter() {
        return this.isConfigurationParameter;
    }

    /**
     * Set a flag indicating if the parameter is a configuration parameter. True if this input parameter is expected to be a constant. Default is false.
     *
     * @param isConfigurationParameter the isConfigurationParameter value to set
     * @return the FunctionInput object itself.
     */
    public FunctionInput withIsConfigurationParameter(Boolean isConfigurationParameter) {
        this.isConfigurationParameter = isConfigurationParameter;
        return this;
    }

}
