/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.compute.v2020_10_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.compute.v2020_10_01_preview.VirtualMachineScaleSetVMRunCommands;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.compute.v2020_10_01_preview.VirtualMachineScaleSetVirtualMachineRunCommand;

class VirtualMachineScaleSetVMRunCommandsImpl extends WrapperImpl<VirtualMachineScaleSetVMRunCommandsInner> implements VirtualMachineScaleSetVMRunCommands {
    private final ComputeManager manager;

    VirtualMachineScaleSetVMRunCommandsImpl(ComputeManager manager) {
        super(manager.inner().virtualMachineScaleSetVMRunCommands());
        this.manager = manager;
    }

    public ComputeManager manager() {
        return this.manager;
    }

    @Override
    public VirtualMachineScaleSetVirtualMachineRunCommandImpl define(String name) {
        return wrapModel(name);
    }

    private VirtualMachineScaleSetVirtualMachineRunCommandImpl wrapModel(VirtualMachineRunCommandInner inner) {
        return  new VirtualMachineScaleSetVirtualMachineRunCommandImpl(inner, manager());
    }

    private VirtualMachineScaleSetVirtualMachineRunCommandImpl wrapModel(String name) {
        return new VirtualMachineScaleSetVirtualMachineRunCommandImpl(name, this.manager());
    }

    @Override
    public Observable<VirtualMachineScaleSetVirtualMachineRunCommand> listAsync(final String resourceGroupName, final String vmScaleSetName, final String instanceId) {
        VirtualMachineScaleSetVMRunCommandsInner client = this.inner();
        return client.listAsync(resourceGroupName, vmScaleSetName, instanceId)
        .flatMapIterable(new Func1<Page<VirtualMachineRunCommandInner>, Iterable<VirtualMachineRunCommandInner>>() {
            @Override
            public Iterable<VirtualMachineRunCommandInner> call(Page<VirtualMachineRunCommandInner> page) {
                return page.items();
            }
        })
        .map(new Func1<VirtualMachineRunCommandInner, VirtualMachineScaleSetVirtualMachineRunCommand>() {
            @Override
            public VirtualMachineScaleSetVirtualMachineRunCommand call(VirtualMachineRunCommandInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<VirtualMachineScaleSetVirtualMachineRunCommand> getAsync(String resourceGroupName, String vmScaleSetName, String instanceId, String runCommandName) {
        VirtualMachineScaleSetVMRunCommandsInner client = this.inner();
        return client.getAsync(resourceGroupName, vmScaleSetName, instanceId, runCommandName)
        .flatMap(new Func1<VirtualMachineRunCommandInner, Observable<VirtualMachineScaleSetVirtualMachineRunCommand>>() {
            @Override
            public Observable<VirtualMachineScaleSetVirtualMachineRunCommand> call(VirtualMachineRunCommandInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((VirtualMachineScaleSetVirtualMachineRunCommand)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String vmScaleSetName, String instanceId, String runCommandName) {
        VirtualMachineScaleSetVMRunCommandsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, vmScaleSetName, instanceId, runCommandName).toCompletable();
    }

}
