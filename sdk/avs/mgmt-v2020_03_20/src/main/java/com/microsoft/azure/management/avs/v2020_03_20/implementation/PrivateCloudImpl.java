/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.avs.v2020_03_20.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.avs.v2020_03_20.PrivateCloud;
import rx.Observable;
import com.microsoft.azure.management.avs.v2020_03_20.PrivateCloudUpdate;
import java.util.List;
import com.microsoft.azure.management.avs.v2020_03_20.Sku;
import com.microsoft.azure.management.avs.v2020_03_20.ManagementCluster;
import com.microsoft.azure.management.avs.v2020_03_20.InternetEnum;
import com.microsoft.azure.management.avs.v2020_03_20.IdentitySource;
import com.microsoft.azure.management.avs.v2020_03_20.PrivateCloudProvisioningState;
import com.microsoft.azure.management.avs.v2020_03_20.Circuit;
import com.microsoft.azure.management.avs.v2020_03_20.Endpoints;
import rx.functions.Func1;

class PrivateCloudImpl extends GroupableResourceCoreImpl<PrivateCloud, PrivateCloudInner, PrivateCloudImpl, AVSManager> implements PrivateCloud, PrivateCloud.Definition, PrivateCloud.Update {
    private PrivateCloudUpdate updateParameter;
    PrivateCloudImpl(String name, PrivateCloudInner inner, AVSManager manager) {
        super(name, inner, manager);
        this.updateParameter = new PrivateCloudUpdate();
    }

    @Override
    public Observable<PrivateCloud> createResourceAsync() {
        PrivateCloudsInner client = this.manager().inner().privateClouds();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(new Func1<PrivateCloudInner, PrivateCloudInner>() {
               @Override
               public PrivateCloudInner call(PrivateCloudInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<PrivateCloud> updateResourceAsync() {
        PrivateCloudsInner client = this.manager().inner().privateClouds();
        return client.updateAsync(this.resourceGroupName(), this.name(), this.updateParameter)
            .map(new Func1<PrivateCloudInner, PrivateCloudInner>() {
               @Override
               public PrivateCloudInner call(PrivateCloudInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<PrivateCloudInner> getInnerAsync() {
        PrivateCloudsInner client = this.manager().inner().privateClouds();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new PrivateCloudUpdate();
    }

    @Override
    public Circuit circuit() {
        return this.inner().circuit();
    }

    @Override
    public Endpoints endpoints() {
        return this.inner().endpoints();
    }

    @Override
    public List<IdentitySource> identitySources() {
        return this.inner().identitySources();
    }

    @Override
    public InternetEnum internet() {
        return this.inner().internet();
    }

    @Override
    public ManagementCluster managementCluster() {
        return this.inner().managementCluster();
    }

    @Override
    public String managementNetwork() {
        return this.inner().managementNetwork();
    }

    @Override
    public String networkBlock() {
        return this.inner().networkBlock();
    }

    @Override
    public String nsxtCertificateThumbprint() {
        return this.inner().nsxtCertificateThumbprint();
    }

    @Override
    public String nsxtPassword() {
        return this.inner().nsxtPassword();
    }

    @Override
    public String provisioningNetwork() {
        return this.inner().provisioningNetwork();
    }

    @Override
    public PrivateCloudProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public Sku sku() {
        return this.inner().sku();
    }

    @Override
    public String vcenterCertificateThumbprint() {
        return this.inner().vcenterCertificateThumbprint();
    }

    @Override
    public String vcenterPassword() {
        return this.inner().vcenterPassword();
    }

    @Override
    public String vmotionNetwork() {
        return this.inner().vmotionNetwork();
    }

    @Override
    public PrivateCloudImpl withNetworkBlock(String networkBlock) {
        this.inner().withNetworkBlock(networkBlock);
        return this;
    }

    @Override
    public PrivateCloudImpl withSku(Sku sku) {
        this.inner().withSku(sku);
        return this;
    }

    @Override
    public PrivateCloudImpl withCircuit(Circuit circuit) {
        this.inner().withCircuit(circuit);
        return this;
    }

    @Override
    public PrivateCloudImpl withNsxtPassword(String nsxtPassword) {
        this.inner().withNsxtPassword(nsxtPassword);
        return this;
    }

    @Override
    public PrivateCloudImpl withVcenterPassword(String vcenterPassword) {
        this.inner().withVcenterPassword(vcenterPassword);
        return this;
    }

    @Override
    public PrivateCloudImpl withIdentitySources(List<IdentitySource> identitySources) {
        if (isInCreateMode()) {
            this.inner().withIdentitySources(identitySources);
        } else {
            this.updateParameter.withIdentitySources(identitySources);
        }
        return this;
    }

    @Override
    public PrivateCloudImpl withInternet(InternetEnum internet) {
        if (isInCreateMode()) {
            this.inner().withInternet(internet);
        } else {
            this.updateParameter.withInternet(internet);
        }
        return this;
    }

    @Override
    public PrivateCloudImpl withManagementCluster(ManagementCluster managementCluster) {
        if (isInCreateMode()) {
            this.inner().withManagementCluster(managementCluster);
        } else {
            this.updateParameter.withManagementCluster(managementCluster);
        }
        return this;
    }

}