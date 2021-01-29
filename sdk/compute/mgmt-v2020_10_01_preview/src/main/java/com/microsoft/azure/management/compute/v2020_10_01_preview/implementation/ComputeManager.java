/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_10_01_preview.implementation;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.AzureResponseBuilder;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Beta.SinceVersion;
import com.microsoft.azure.arm.resources.AzureConfigurable;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.RestClient;
import com.microsoft.azure.management.compute.v2020_10_01_preview.Operations;
import com.microsoft.azure.management.compute.v2020_10_01_preview.AvailabilitySets;
import com.microsoft.azure.management.compute.v2020_10_01_preview.ProximityPlacementGroups;
import com.microsoft.azure.management.compute.v2020_10_01_preview.DedicatedHostGroups;
import com.microsoft.azure.management.compute.v2020_10_01_preview.DedicatedHosts;
import com.microsoft.azure.management.compute.v2020_10_01_preview.SshPublicKeys;
import com.microsoft.azure.management.compute.v2020_10_01_preview.VirtualMachineExtensionImages;
import com.microsoft.azure.management.compute.v2020_10_01_preview.VirtualMachineExtensions;
import com.microsoft.azure.management.compute.v2020_10_01_preview.VirtualMachineImages;
import com.microsoft.azure.management.compute.v2020_10_01_preview.Usages;
import com.microsoft.azure.management.compute.v2020_10_01_preview.VirtualMachines;
import com.microsoft.azure.management.compute.v2020_10_01_preview.VirtualMachineSizes;
import com.microsoft.azure.management.compute.v2020_10_01_preview.Images;
import com.microsoft.azure.management.compute.v2020_10_01_preview.VirtualMachineScaleSets;
import com.microsoft.azure.management.compute.v2020_10_01_preview.VirtualMachineScaleSetExtensions;
import com.microsoft.azure.management.compute.v2020_10_01_preview.VirtualMachineScaleSetRollingUpgrades;
import com.microsoft.azure.management.compute.v2020_10_01_preview.VirtualMachineScaleSetVMExtensions;
import com.microsoft.azure.management.compute.v2020_10_01_preview.VirtualMachineScaleSetVMs;
import com.microsoft.azure.management.compute.v2020_10_01_preview.LogAnalytics;
import com.microsoft.azure.management.compute.v2020_10_01_preview.VirtualMachineRunCommands;
import com.microsoft.azure.management.compute.v2020_10_01_preview.VirtualMachineScaleSetVMRunCommands;
import com.microsoft.azure.management.compute.v2020_10_01_preview.ResourceSkus;
import com.microsoft.azure.management.compute.v2020_10_01_preview.Disks;
import com.microsoft.azure.management.compute.v2020_10_01_preview.Snapshots;
import com.microsoft.azure.management.compute.v2020_10_01_preview.DiskEncryptionSets;
import com.microsoft.azure.management.compute.v2020_10_01_preview.DiskAccesses;
import com.microsoft.azure.management.compute.v2020_10_01_preview.DiskRestorePoints;
import com.microsoft.azure.management.compute.v2020_10_01_preview.Galleries;
import com.microsoft.azure.management.compute.v2020_10_01_preview.GalleryImages;
import com.microsoft.azure.management.compute.v2020_10_01_preview.GalleryImageVersions;
import com.microsoft.azure.management.compute.v2020_10_01_preview.GalleryApplications;
import com.microsoft.azure.management.compute.v2020_10_01_preview.GalleryApplicationVersions;
import com.microsoft.azure.management.compute.v2020_10_01_preview.ContainerServices;
import com.microsoft.azure.management.compute.v2020_10_01_preview.CloudServiceRoleInstances;
import com.microsoft.azure.management.compute.v2020_10_01_preview.CloudServiceRoles;
import com.microsoft.azure.management.compute.v2020_10_01_preview.CloudServices;
import com.microsoft.azure.management.compute.v2020_10_01_preview.CloudServicesUpdateDomains;
import com.microsoft.azure.arm.resources.implementation.AzureConfigurableCoreImpl;
import com.microsoft.azure.arm.resources.implementation.ManagerCore;

/**
 * Entry point to Azure Compute resource management.
 */
public final class ComputeManager extends ManagerCore<ComputeManager, ComputeManagementClientImpl> {
    private Operations operations;
    private AvailabilitySets availabilitySets;
    private ProximityPlacementGroups proximityPlacementGroups;
    private DedicatedHostGroups dedicatedHostGroups;
    private DedicatedHosts dedicatedHosts;
    private SshPublicKeys sshPublicKeys;
    private VirtualMachineExtensionImages virtualMachineExtensionImages;
    private VirtualMachineExtensions virtualMachineExtensions;
    private VirtualMachineImages virtualMachineImages;
    private Usages usages;
    private VirtualMachines virtualMachines;
    private VirtualMachineSizes virtualMachineSizes;
    private Images images;
    private VirtualMachineScaleSets virtualMachineScaleSets;
    private VirtualMachineScaleSetExtensions virtualMachineScaleSetExtensions;
    private VirtualMachineScaleSetRollingUpgrades virtualMachineScaleSetRollingUpgrades;
    private VirtualMachineScaleSetVMExtensions virtualMachineScaleSetVMExtensions;
    private VirtualMachineScaleSetVMs virtualMachineScaleSetVMs;
    private LogAnalytics logAnalytics;
    private VirtualMachineRunCommands virtualMachineRunCommands;
    private VirtualMachineScaleSetVMRunCommands virtualMachineScaleSetVMRunCommands;
    private ResourceSkus resourceSkus;
    private Disks disks;
    private Snapshots snapshots;
    private DiskEncryptionSets diskEncryptionSets;
    private DiskAccesses diskAccesses;
    private DiskRestorePoints diskRestorePoints;
    private Galleries galleries;
    private GalleryImages galleryImages;
    private GalleryImageVersions galleryImageVersions;
    private GalleryApplications galleryApplications;
    private GalleryApplicationVersions galleryApplicationVersions;
    private ContainerServices containerServices;
    private CloudServiceRoleInstances cloudServiceRoleInstances;
    private CloudServiceRoles cloudServiceRoles;
    private CloudServices cloudServices;
    private CloudServicesUpdateDomains cloudServicesUpdateDomains;
    /**
    * Get a Configurable instance that can be used to create ComputeManager with optional configuration.
    *
    * @return the instance allowing configurations
    */
    public static Configurable configure() {
        return new ComputeManager.ConfigurableImpl();
    }
    /**
    * Creates an instance of ComputeManager that exposes Compute resource management API entry points.
    *
    * @param credentials the credentials to use
    * @param subscriptionId the subscription UUID
    * @return the ComputeManager
    */
    public static ComputeManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
        return new ComputeManager(new RestClient.Builder()
            .withBaseUrl(credentials.environment(), AzureEnvironment.Endpoint.RESOURCE_MANAGER)
            .withCredentials(credentials)
            .withSerializerAdapter(new AzureJacksonAdapter())
            .withResponseBuilderFactory(new AzureResponseBuilder.Factory())
            .build(), subscriptionId);
    }
    /**
    * Creates an instance of ComputeManager that exposes Compute resource management API entry points.
    *
    * @param restClient the RestClient to be used for API calls.
    * @param subscriptionId the subscription UUID
    * @return the ComputeManager
    */
    public static ComputeManager authenticate(RestClient restClient, String subscriptionId) {
        return new ComputeManager(restClient, subscriptionId);
    }
    /**
    * The interface allowing configurations to be set.
    */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
        * Creates an instance of ComputeManager that exposes Compute management API entry points.
        *
        * @param credentials the credentials to use
        * @param subscriptionId the subscription UUID
        * @return the interface exposing Compute management API entry points that work across subscriptions
        */
        ComputeManager authenticate(AzureTokenCredentials credentials, String subscriptionId);
    }

    /**
     * @return Entry point to manage Operations.
     */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(this);
        }
        return this.operations;
    }

    /**
     * @return Entry point to manage AvailabilitySets.
     */
    public AvailabilitySets availabilitySets() {
        if (this.availabilitySets == null) {
            this.availabilitySets = new AvailabilitySetsImpl(this);
        }
        return this.availabilitySets;
    }

    /**
     * @return Entry point to manage ProximityPlacementGroups.
     */
    public ProximityPlacementGroups proximityPlacementGroups() {
        if (this.proximityPlacementGroups == null) {
            this.proximityPlacementGroups = new ProximityPlacementGroupsImpl(this);
        }
        return this.proximityPlacementGroups;
    }

    /**
     * @return Entry point to manage DedicatedHostGroups.
     */
    public DedicatedHostGroups dedicatedHostGroups() {
        if (this.dedicatedHostGroups == null) {
            this.dedicatedHostGroups = new DedicatedHostGroupsImpl(this);
        }
        return this.dedicatedHostGroups;
    }

    /**
     * @return Entry point to manage DedicatedHosts.
     */
    public DedicatedHosts dedicatedHosts() {
        if (this.dedicatedHosts == null) {
            this.dedicatedHosts = new DedicatedHostsImpl(this);
        }
        return this.dedicatedHosts;
    }

    /**
     * @return Entry point to manage SshPublicKeys.
     */
    public SshPublicKeys sshPublicKeys() {
        if (this.sshPublicKeys == null) {
            this.sshPublicKeys = new SshPublicKeysImpl(this);
        }
        return this.sshPublicKeys;
    }

    /**
     * @return Entry point to manage VirtualMachineExtensionImages.
     */
    public VirtualMachineExtensionImages virtualMachineExtensionImages() {
        if (this.virtualMachineExtensionImages == null) {
            this.virtualMachineExtensionImages = new VirtualMachineExtensionImagesImpl(this);
        }
        return this.virtualMachineExtensionImages;
    }

    /**
     * @return Entry point to manage VirtualMachineExtensions.
     */
    public VirtualMachineExtensions virtualMachineExtensions() {
        if (this.virtualMachineExtensions == null) {
            this.virtualMachineExtensions = new VirtualMachineExtensionsImpl(this);
        }
        return this.virtualMachineExtensions;
    }

    /**
     * @return Entry point to manage VirtualMachineImages.
     */
    public VirtualMachineImages virtualMachineImages() {
        if (this.virtualMachineImages == null) {
            this.virtualMachineImages = new VirtualMachineImagesImpl(this);
        }
        return this.virtualMachineImages;
    }

    /**
     * @return Entry point to manage Usages.
     */
    public Usages usages() {
        if (this.usages == null) {
            this.usages = new UsagesImpl(this);
        }
        return this.usages;
    }

    /**
     * @return Entry point to manage VirtualMachines.
     */
    public VirtualMachines virtualMachines() {
        if (this.virtualMachines == null) {
            this.virtualMachines = new VirtualMachinesImpl(this);
        }
        return this.virtualMachines;
    }

    /**
     * @return Entry point to manage VirtualMachineSizes.
     */
    public VirtualMachineSizes virtualMachineSizes() {
        if (this.virtualMachineSizes == null) {
            this.virtualMachineSizes = new VirtualMachineSizesImpl(this);
        }
        return this.virtualMachineSizes;
    }

    /**
     * @return Entry point to manage Images.
     */
    public Images images() {
        if (this.images == null) {
            this.images = new ImagesImpl(this);
        }
        return this.images;
    }

    /**
     * @return Entry point to manage VirtualMachineScaleSets.
     */
    public VirtualMachineScaleSets virtualMachineScaleSets() {
        if (this.virtualMachineScaleSets == null) {
            this.virtualMachineScaleSets = new VirtualMachineScaleSetsImpl(this);
        }
        return this.virtualMachineScaleSets;
    }

    /**
     * @return Entry point to manage VirtualMachineScaleSetExtensions.
     */
    public VirtualMachineScaleSetExtensions virtualMachineScaleSetExtensions() {
        if (this.virtualMachineScaleSetExtensions == null) {
            this.virtualMachineScaleSetExtensions = new VirtualMachineScaleSetExtensionsImpl(this);
        }
        return this.virtualMachineScaleSetExtensions;
    }

    /**
     * @return Entry point to manage VirtualMachineScaleSetRollingUpgrades.
     */
    public VirtualMachineScaleSetRollingUpgrades virtualMachineScaleSetRollingUpgrades() {
        if (this.virtualMachineScaleSetRollingUpgrades == null) {
            this.virtualMachineScaleSetRollingUpgrades = new VirtualMachineScaleSetRollingUpgradesImpl(this);
        }
        return this.virtualMachineScaleSetRollingUpgrades;
    }

    /**
     * @return Entry point to manage VirtualMachineScaleSetVMExtensions.
     */
    public VirtualMachineScaleSetVMExtensions virtualMachineScaleSetVMExtensions() {
        if (this.virtualMachineScaleSetVMExtensions == null) {
            this.virtualMachineScaleSetVMExtensions = new VirtualMachineScaleSetVMExtensionsImpl(this);
        }
        return this.virtualMachineScaleSetVMExtensions;
    }

    /**
     * @return Entry point to manage VirtualMachineScaleSetVMs.
     */
    public VirtualMachineScaleSetVMs virtualMachineScaleSetVMs() {
        if (this.virtualMachineScaleSetVMs == null) {
            this.virtualMachineScaleSetVMs = new VirtualMachineScaleSetVMsImpl(this);
        }
        return this.virtualMachineScaleSetVMs;
    }

    /**
     * @return Entry point to manage LogAnalytics.
     */
    public LogAnalytics logAnalytics() {
        if (this.logAnalytics == null) {
            this.logAnalytics = new LogAnalyticsImpl(this);
        }
        return this.logAnalytics;
    }

    /**
     * @return Entry point to manage VirtualMachineRunCommands.
     */
    public VirtualMachineRunCommands virtualMachineRunCommands() {
        if (this.virtualMachineRunCommands == null) {
            this.virtualMachineRunCommands = new VirtualMachineRunCommandsImpl(this);
        }
        return this.virtualMachineRunCommands;
    }

    /**
     * @return Entry point to manage VirtualMachineScaleSetVMRunCommands.
     */
    public VirtualMachineScaleSetVMRunCommands virtualMachineScaleSetVMRunCommands() {
        if (this.virtualMachineScaleSetVMRunCommands == null) {
            this.virtualMachineScaleSetVMRunCommands = new VirtualMachineScaleSetVMRunCommandsImpl(this);
        }
        return this.virtualMachineScaleSetVMRunCommands;
    }

    /**
     * @return Entry point to manage ResourceSkus.
     */
    public ResourceSkus resourceSkus() {
        if (this.resourceSkus == null) {
            this.resourceSkus = new ResourceSkusImpl(this);
        }
        return this.resourceSkus;
    }

    /**
     * @return Entry point to manage Disks.
     */
    public Disks disks() {
        if (this.disks == null) {
            this.disks = new DisksImpl(this);
        }
        return this.disks;
    }

    /**
     * @return Entry point to manage Snapshots.
     */
    public Snapshots snapshots() {
        if (this.snapshots == null) {
            this.snapshots = new SnapshotsImpl(this);
        }
        return this.snapshots;
    }

    /**
     * @return Entry point to manage DiskEncryptionSets.
     */
    public DiskEncryptionSets diskEncryptionSets() {
        if (this.diskEncryptionSets == null) {
            this.diskEncryptionSets = new DiskEncryptionSetsImpl(this);
        }
        return this.diskEncryptionSets;
    }

    /**
     * @return Entry point to manage DiskAccesses.
     */
    public DiskAccesses diskAccesses() {
        if (this.diskAccesses == null) {
            this.diskAccesses = new DiskAccessesImpl(this);
        }
        return this.diskAccesses;
    }

    /**
     * @return Entry point to manage DiskRestorePoints.
     */
    public DiskRestorePoints diskRestorePoints() {
        if (this.diskRestorePoints == null) {
            this.diskRestorePoints = new DiskRestorePointsImpl(this);
        }
        return this.diskRestorePoints;
    }

    /**
     * @return Entry point to manage Galleries.
     */
    public Galleries galleries() {
        if (this.galleries == null) {
            this.galleries = new GalleriesImpl(this);
        }
        return this.galleries;
    }

    /**
     * @return Entry point to manage GalleryImages.
     */
    public GalleryImages galleryImages() {
        if (this.galleryImages == null) {
            this.galleryImages = new GalleryImagesImpl(this);
        }
        return this.galleryImages;
    }

    /**
     * @return Entry point to manage GalleryImageVersions.
     */
    public GalleryImageVersions galleryImageVersions() {
        if (this.galleryImageVersions == null) {
            this.galleryImageVersions = new GalleryImageVersionsImpl(this);
        }
        return this.galleryImageVersions;
    }

    /**
     * @return Entry point to manage GalleryApplications.
     */
    public GalleryApplications galleryApplications() {
        if (this.galleryApplications == null) {
            this.galleryApplications = new GalleryApplicationsImpl(this);
        }
        return this.galleryApplications;
    }

    /**
     * @return Entry point to manage GalleryApplicationVersions.
     */
    public GalleryApplicationVersions galleryApplicationVersions() {
        if (this.galleryApplicationVersions == null) {
            this.galleryApplicationVersions = new GalleryApplicationVersionsImpl(this);
        }
        return this.galleryApplicationVersions;
    }

    /**
     * @return Entry point to manage ContainerServices.
     */
    public ContainerServices containerServices() {
        if (this.containerServices == null) {
            this.containerServices = new ContainerServicesImpl(this);
        }
        return this.containerServices;
    }

    /**
     * @return Entry point to manage CloudServiceRoleInstances.
     */
    public CloudServiceRoleInstances cloudServiceRoleInstances() {
        if (this.cloudServiceRoleInstances == null) {
            this.cloudServiceRoleInstances = new CloudServiceRoleInstancesImpl(this);
        }
        return this.cloudServiceRoleInstances;
    }

    /**
     * @return Entry point to manage CloudServiceRoles.
     */
    public CloudServiceRoles cloudServiceRoles() {
        if (this.cloudServiceRoles == null) {
            this.cloudServiceRoles = new CloudServiceRolesImpl(this);
        }
        return this.cloudServiceRoles;
    }

    /**
     * @return Entry point to manage CloudServices.
     */
    public CloudServices cloudServices() {
        if (this.cloudServices == null) {
            this.cloudServices = new CloudServicesImpl(this);
        }
        return this.cloudServices;
    }

    /**
     * @return Entry point to manage CloudServicesUpdateDomains.
     */
    public CloudServicesUpdateDomains cloudServicesUpdateDomains() {
        if (this.cloudServicesUpdateDomains == null) {
            this.cloudServicesUpdateDomains = new CloudServicesUpdateDomainsImpl(this);
        }
        return this.cloudServicesUpdateDomains;
    }

    /**
    * The implementation for Configurable interface.
    */
    private static final class ConfigurableImpl extends AzureConfigurableCoreImpl<Configurable> implements Configurable {
        public ComputeManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
           return ComputeManager.authenticate(buildRestClient(credentials), subscriptionId);
        }
     }
    private ComputeManager(RestClient restClient, String subscriptionId) {
        super(
            restClient,
            subscriptionId,
            new ComputeManagementClientImpl(restClient).withSubscriptionId(subscriptionId));
    }
}
