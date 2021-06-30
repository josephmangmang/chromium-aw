// VkPhysicalDeviceLimits.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     gpu/ipc/common/vulkan_types.mojom
//

package org.chromium.gpu.mojom;


public final class VkPhysicalDeviceLimits extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 488;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(488, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public int maxImageDimension1D;
    public int maxImageDimension2D;
    public int maxImageDimension3D;
    public int maxImageDimensionCube;
    public int maxImageArrayLayers;
    public int maxTexelBufferElements;
    public int maxUniformBufferRange;
    public int maxStorageBufferRange;
    public int maxPushConstantsSize;
    public int maxMemoryAllocationCount;
    public int maxSamplerAllocationCount;
    public long bufferImageGranularity;
    public long sparseAddressSpaceSize;
    public int maxBoundDescriptorSets;
    public int maxPerStageDescriptorSamplers;
    public int maxPerStageDescriptorUniformBuffers;
    public int maxPerStageDescriptorStorageBuffers;
    public int maxPerStageDescriptorSampledImages;
    public int maxPerStageDescriptorStorageImages;
    public int maxPerStageDescriptorInputAttachments;
    public int maxPerStageResources;
    public int maxDescriptorSetSamplers;
    public int maxDescriptorSetUniformBuffers;
    public int maxDescriptorSetUniformBuffersDynamic;
    public int maxDescriptorSetStorageBuffers;
    public int maxDescriptorSetStorageBuffersDynamic;
    public int maxDescriptorSetSampledImages;
    public int maxDescriptorSetStorageImages;
    public int maxDescriptorSetInputAttachments;
    public int maxVertexInputAttributes;
    public int maxVertexInputBindings;
    public int maxVertexInputAttributeOffset;
    public int maxVertexInputBindingStride;
    public int maxVertexOutputComponents;
    public int maxTessellationGenerationLevel;
    public int maxTessellationPatchSize;
    public int maxTessellationControlPerVertexInputComponents;
    public int maxTessellationControlPerVertexOutputComponents;
    public int maxTessellationControlPerPatchOutputComponents;
    public int maxTessellationControlTotalOutputComponents;
    public int maxTessellationEvaluationInputComponents;
    public int maxTessellationEvaluationOutputComponents;
    public int maxGeometryShaderInvocations;
    public int maxGeometryInputComponents;
    public int maxGeometryOutputComponents;
    public int maxGeometryOutputVertices;
    public int maxGeometryTotalOutputComponents;
    public int maxFragmentInputComponents;
    public int maxFragmentOutputAttachments;
    public int maxFragmentDualSrcAttachments;
    public int maxFragmentCombinedOutputResources;
    public int maxComputeSharedMemorySize;
    public int[] maxComputeWorkGroupCount;
    public int maxComputeWorkGroupInvocations;
    public int[] maxComputeWorkGroupSize;
    public int subPixelPrecisionBits;
    public int subTexelPrecisionBits;
    public int mipmapPrecisionBits;
    public int maxDrawIndexedIndexValue;
    public int maxDrawIndirectCount;
    public float maxSamplerLodBias;
    public float maxSamplerAnisotropy;
    public int maxViewports;
    public int[] maxViewportDimensions;
    public float[] viewportBoundsRange;
    public int viewportSubPixelBits;
    public long minMemoryMapAlignment;
    public long minTexelBufferOffsetAlignment;
    public long minUniformBufferOffsetAlignment;
    public long minStorageBufferOffsetAlignment;
    public int minTexelOffset;
    public int maxTexelOffset;
    public int minTexelGatherOffset;
    public int maxTexelGatherOffset;
    public float minInterpolationOffset;
    public float maxInterpolationOffset;
    public int subPixelInterpolationOffsetBits;
    public int maxFramebufferWidth;
    public int maxFramebufferHeight;
    public int maxFramebufferLayers;
    public int framebufferColorSampleCounts;
    public int framebufferDepthSampleCounts;
    public int framebufferStencilSampleCounts;
    public int framebufferNoAttachmentsSampleCounts;
    public int maxColorAttachments;
    public int sampledImageColorSampleCounts;
    public int sampledImageIntegerSampleCounts;
    public int sampledImageDepthSampleCounts;
    public int sampledImageStencilSampleCounts;
    public int storageImageSampleCounts;
    public int maxSampleMaskWords;
    public boolean timestampComputeAndGraphics;
    public float timestampPeriod;
    public int maxClipDistances;
    public int maxCullDistances;
    public int maxCombinedClipAndCullDistances;
    public int discreteQueuePriorities;
    public float[] pointSizeRange;
    public float[] lineWidthRange;
    public float pointSizeGranularity;
    public float lineWidthGranularity;
    public boolean strictLines;
    public boolean standardSampleLocations;
    public long optimalBufferCopyOffsetAlignment;
    public long optimalBufferCopyRowPitchAlignment;
    public long nonCoherentAtomSize;

    private VkPhysicalDeviceLimits(int version) {
        super(STRUCT_SIZE, version);
    }

    public VkPhysicalDeviceLimits() {
        this(0);
    }

    public static VkPhysicalDeviceLimits deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static VkPhysicalDeviceLimits deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static VkPhysicalDeviceLimits decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        VkPhysicalDeviceLimits result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new VkPhysicalDeviceLimits(elementsOrVersion);
                {
                    
                result.maxImageDimension1D = decoder0.readInt(8);
                }
                {
                    
                result.maxImageDimension2D = decoder0.readInt(12);
                }
                {
                    
                result.maxImageDimension3D = decoder0.readInt(16);
                }
                {
                    
                result.maxImageDimensionCube = decoder0.readInt(20);
                }
                {
                    
                result.maxImageArrayLayers = decoder0.readInt(24);
                }
                {
                    
                result.maxTexelBufferElements = decoder0.readInt(28);
                }
                {
                    
                result.maxUniformBufferRange = decoder0.readInt(32);
                }
                {
                    
                result.maxStorageBufferRange = decoder0.readInt(36);
                }
                {
                    
                result.maxPushConstantsSize = decoder0.readInt(40);
                }
                {
                    
                result.maxMemoryAllocationCount = decoder0.readInt(44);
                }
                {
                    
                result.maxSamplerAllocationCount = decoder0.readInt(48);
                }
                {
                    
                result.maxBoundDescriptorSets = decoder0.readInt(52);
                }
                {
                    
                result.bufferImageGranularity = decoder0.readLong(56);
                }
                {
                    
                result.sparseAddressSpaceSize = decoder0.readLong(64);
                }
                {
                    
                result.maxPerStageDescriptorSamplers = decoder0.readInt(72);
                }
                {
                    
                result.maxPerStageDescriptorUniformBuffers = decoder0.readInt(76);
                }
                {
                    
                result.maxPerStageDescriptorStorageBuffers = decoder0.readInt(80);
                }
                {
                    
                result.maxPerStageDescriptorSampledImages = decoder0.readInt(84);
                }
                {
                    
                result.maxPerStageDescriptorStorageImages = decoder0.readInt(88);
                }
                {
                    
                result.maxPerStageDescriptorInputAttachments = decoder0.readInt(92);
                }
                {
                    
                result.maxPerStageResources = decoder0.readInt(96);
                }
                {
                    
                result.maxDescriptorSetSamplers = decoder0.readInt(100);
                }
                {
                    
                result.maxDescriptorSetUniformBuffers = decoder0.readInt(104);
                }
                {
                    
                result.maxDescriptorSetUniformBuffersDynamic = decoder0.readInt(108);
                }
                {
                    
                result.maxDescriptorSetStorageBuffers = decoder0.readInt(112);
                }
                {
                    
                result.maxDescriptorSetStorageBuffersDynamic = decoder0.readInt(116);
                }
                {
                    
                result.maxDescriptorSetSampledImages = decoder0.readInt(120);
                }
                {
                    
                result.maxDescriptorSetStorageImages = decoder0.readInt(124);
                }
                {
                    
                result.maxDescriptorSetInputAttachments = decoder0.readInt(128);
                }
                {
                    
                result.maxVertexInputAttributes = decoder0.readInt(132);
                }
                {
                    
                result.maxVertexInputBindings = decoder0.readInt(136);
                }
                {
                    
                result.maxVertexInputAttributeOffset = decoder0.readInt(140);
                }
                {
                    
                result.maxVertexInputBindingStride = decoder0.readInt(144);
                }
                {
                    
                result.maxVertexOutputComponents = decoder0.readInt(148);
                }
                {
                    
                result.maxTessellationGenerationLevel = decoder0.readInt(152);
                }
                {
                    
                result.maxTessellationPatchSize = decoder0.readInt(156);
                }
                {
                    
                result.maxTessellationControlPerVertexInputComponents = decoder0.readInt(160);
                }
                {
                    
                result.maxTessellationControlPerVertexOutputComponents = decoder0.readInt(164);
                }
                {
                    
                result.maxTessellationControlPerPatchOutputComponents = decoder0.readInt(168);
                }
                {
                    
                result.maxTessellationControlTotalOutputComponents = decoder0.readInt(172);
                }
                {
                    
                result.maxTessellationEvaluationInputComponents = decoder0.readInt(176);
                }
                {
                    
                result.maxTessellationEvaluationOutputComponents = decoder0.readInt(180);
                }
                {
                    
                result.maxGeometryShaderInvocations = decoder0.readInt(184);
                }
                {
                    
                result.maxGeometryInputComponents = decoder0.readInt(188);
                }
                {
                    
                result.maxGeometryOutputComponents = decoder0.readInt(192);
                }
                {
                    
                result.maxGeometryOutputVertices = decoder0.readInt(196);
                }
                {
                    
                result.maxGeometryTotalOutputComponents = decoder0.readInt(200);
                }
                {
                    
                result.maxFragmentInputComponents = decoder0.readInt(204);
                }
                {
                    
                result.maxFragmentOutputAttachments = decoder0.readInt(208);
                }
                {
                    
                result.maxFragmentDualSrcAttachments = decoder0.readInt(212);
                }
                {
                    
                result.maxFragmentCombinedOutputResources = decoder0.readInt(216);
                }
                {
                    
                result.maxComputeSharedMemorySize = decoder0.readInt(220);
                }
                {
                    
                result.maxComputeWorkGroupCount = decoder0.readInts(224, org.chromium.mojo.bindings.BindingsHelper.NOTHING_NULLABLE, 3);
                }
                {
                    
                result.maxComputeWorkGroupInvocations = decoder0.readInt(232);
                }
                {
                    
                result.subPixelPrecisionBits = decoder0.readInt(236);
                }
                {
                    
                result.maxComputeWorkGroupSize = decoder0.readInts(240, org.chromium.mojo.bindings.BindingsHelper.NOTHING_NULLABLE, 3);
                }
                {
                    
                result.subTexelPrecisionBits = decoder0.readInt(248);
                }
                {
                    
                result.mipmapPrecisionBits = decoder0.readInt(252);
                }
                {
                    
                result.maxDrawIndexedIndexValue = decoder0.readInt(256);
                }
                {
                    
                result.maxDrawIndirectCount = decoder0.readInt(260);
                }
                {
                    
                result.maxSamplerLodBias = decoder0.readFloat(264);
                }
                {
                    
                result.maxSamplerAnisotropy = decoder0.readFloat(268);
                }
                {
                    
                result.maxViewports = decoder0.readInt(272);
                }
                {
                    
                result.viewportSubPixelBits = decoder0.readInt(276);
                }
                {
                    
                result.maxViewportDimensions = decoder0.readInts(280, org.chromium.mojo.bindings.BindingsHelper.NOTHING_NULLABLE, 2);
                }
                {
                    
                result.viewportBoundsRange = decoder0.readFloats(288, org.chromium.mojo.bindings.BindingsHelper.NOTHING_NULLABLE, 2);
                }
                {
                    
                result.minMemoryMapAlignment = decoder0.readLong(296);
                }
                {
                    
                result.minTexelBufferOffsetAlignment = decoder0.readLong(304);
                }
                {
                    
                result.minUniformBufferOffsetAlignment = decoder0.readLong(312);
                }
                {
                    
                result.minStorageBufferOffsetAlignment = decoder0.readLong(320);
                }
                {
                    
                result.minTexelOffset = decoder0.readInt(328);
                }
                {
                    
                result.maxTexelOffset = decoder0.readInt(332);
                }
                {
                    
                result.minTexelGatherOffset = decoder0.readInt(336);
                }
                {
                    
                result.maxTexelGatherOffset = decoder0.readInt(340);
                }
                {
                    
                result.minInterpolationOffset = decoder0.readFloat(344);
                }
                {
                    
                result.maxInterpolationOffset = decoder0.readFloat(348);
                }
                {
                    
                result.subPixelInterpolationOffsetBits = decoder0.readInt(352);
                }
                {
                    
                result.maxFramebufferWidth = decoder0.readInt(356);
                }
                {
                    
                result.maxFramebufferHeight = decoder0.readInt(360);
                }
                {
                    
                result.maxFramebufferLayers = decoder0.readInt(364);
                }
                {
                    
                result.framebufferColorSampleCounts = decoder0.readInt(368);
                }
                {
                    
                result.framebufferDepthSampleCounts = decoder0.readInt(372);
                }
                {
                    
                result.framebufferStencilSampleCounts = decoder0.readInt(376);
                }
                {
                    
                result.framebufferNoAttachmentsSampleCounts = decoder0.readInt(380);
                }
                {
                    
                result.maxColorAttachments = decoder0.readInt(384);
                }
                {
                    
                result.sampledImageColorSampleCounts = decoder0.readInt(388);
                }
                {
                    
                result.sampledImageIntegerSampleCounts = decoder0.readInt(392);
                }
                {
                    
                result.sampledImageDepthSampleCounts = decoder0.readInt(396);
                }
                {
                    
                result.sampledImageStencilSampleCounts = decoder0.readInt(400);
                }
                {
                    
                result.storageImageSampleCounts = decoder0.readInt(404);
                }
                {
                    
                result.maxSampleMaskWords = decoder0.readInt(408);
                }
                {
                    
                result.timestampComputeAndGraphics = decoder0.readBoolean(412, 0);
                }
                {
                    
                result.strictLines = decoder0.readBoolean(412, 1);
                }
                {
                    
                result.standardSampleLocations = decoder0.readBoolean(412, 2);
                }
                {
                    
                result.timestampPeriod = decoder0.readFloat(416);
                }
                {
                    
                result.maxClipDistances = decoder0.readInt(420);
                }
                {
                    
                result.maxCullDistances = decoder0.readInt(424);
                }
                {
                    
                result.maxCombinedClipAndCullDistances = decoder0.readInt(428);
                }
                {
                    
                result.discreteQueuePriorities = decoder0.readInt(432);
                }
                {
                    
                result.pointSizeGranularity = decoder0.readFloat(436);
                }
                {
                    
                result.pointSizeRange = decoder0.readFloats(440, org.chromium.mojo.bindings.BindingsHelper.NOTHING_NULLABLE, 2);
                }
                {
                    
                result.lineWidthRange = decoder0.readFloats(448, org.chromium.mojo.bindings.BindingsHelper.NOTHING_NULLABLE, 2);
                }
                {
                    
                result.lineWidthGranularity = decoder0.readFloat(456);
                }
                {
                    
                result.optimalBufferCopyOffsetAlignment = decoder0.readLong(464);
                }
                {
                    
                result.optimalBufferCopyRowPitchAlignment = decoder0.readLong(472);
                }
                {
                    
                result.nonCoherentAtomSize = decoder0.readLong(480);
                }

        } finally {
            decoder0.decreaseStackDepth();
        }
        return result;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
        org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        
        encoder0.encode(this.maxImageDimension1D, 8);
        
        encoder0.encode(this.maxImageDimension2D, 12);
        
        encoder0.encode(this.maxImageDimension3D, 16);
        
        encoder0.encode(this.maxImageDimensionCube, 20);
        
        encoder0.encode(this.maxImageArrayLayers, 24);
        
        encoder0.encode(this.maxTexelBufferElements, 28);
        
        encoder0.encode(this.maxUniformBufferRange, 32);
        
        encoder0.encode(this.maxStorageBufferRange, 36);
        
        encoder0.encode(this.maxPushConstantsSize, 40);
        
        encoder0.encode(this.maxMemoryAllocationCount, 44);
        
        encoder0.encode(this.maxSamplerAllocationCount, 48);
        
        encoder0.encode(this.maxBoundDescriptorSets, 52);
        
        encoder0.encode(this.bufferImageGranularity, 56);
        
        encoder0.encode(this.sparseAddressSpaceSize, 64);
        
        encoder0.encode(this.maxPerStageDescriptorSamplers, 72);
        
        encoder0.encode(this.maxPerStageDescriptorUniformBuffers, 76);
        
        encoder0.encode(this.maxPerStageDescriptorStorageBuffers, 80);
        
        encoder0.encode(this.maxPerStageDescriptorSampledImages, 84);
        
        encoder0.encode(this.maxPerStageDescriptorStorageImages, 88);
        
        encoder0.encode(this.maxPerStageDescriptorInputAttachments, 92);
        
        encoder0.encode(this.maxPerStageResources, 96);
        
        encoder0.encode(this.maxDescriptorSetSamplers, 100);
        
        encoder0.encode(this.maxDescriptorSetUniformBuffers, 104);
        
        encoder0.encode(this.maxDescriptorSetUniformBuffersDynamic, 108);
        
        encoder0.encode(this.maxDescriptorSetStorageBuffers, 112);
        
        encoder0.encode(this.maxDescriptorSetStorageBuffersDynamic, 116);
        
        encoder0.encode(this.maxDescriptorSetSampledImages, 120);
        
        encoder0.encode(this.maxDescriptorSetStorageImages, 124);
        
        encoder0.encode(this.maxDescriptorSetInputAttachments, 128);
        
        encoder0.encode(this.maxVertexInputAttributes, 132);
        
        encoder0.encode(this.maxVertexInputBindings, 136);
        
        encoder0.encode(this.maxVertexInputAttributeOffset, 140);
        
        encoder0.encode(this.maxVertexInputBindingStride, 144);
        
        encoder0.encode(this.maxVertexOutputComponents, 148);
        
        encoder0.encode(this.maxTessellationGenerationLevel, 152);
        
        encoder0.encode(this.maxTessellationPatchSize, 156);
        
        encoder0.encode(this.maxTessellationControlPerVertexInputComponents, 160);
        
        encoder0.encode(this.maxTessellationControlPerVertexOutputComponents, 164);
        
        encoder0.encode(this.maxTessellationControlPerPatchOutputComponents, 168);
        
        encoder0.encode(this.maxTessellationControlTotalOutputComponents, 172);
        
        encoder0.encode(this.maxTessellationEvaluationInputComponents, 176);
        
        encoder0.encode(this.maxTessellationEvaluationOutputComponents, 180);
        
        encoder0.encode(this.maxGeometryShaderInvocations, 184);
        
        encoder0.encode(this.maxGeometryInputComponents, 188);
        
        encoder0.encode(this.maxGeometryOutputComponents, 192);
        
        encoder0.encode(this.maxGeometryOutputVertices, 196);
        
        encoder0.encode(this.maxGeometryTotalOutputComponents, 200);
        
        encoder0.encode(this.maxFragmentInputComponents, 204);
        
        encoder0.encode(this.maxFragmentOutputAttachments, 208);
        
        encoder0.encode(this.maxFragmentDualSrcAttachments, 212);
        
        encoder0.encode(this.maxFragmentCombinedOutputResources, 216);
        
        encoder0.encode(this.maxComputeSharedMemorySize, 220);
        
        encoder0.encode(this.maxComputeWorkGroupCount, 224, org.chromium.mojo.bindings.BindingsHelper.NOTHING_NULLABLE, 3);
        
        encoder0.encode(this.maxComputeWorkGroupInvocations, 232);
        
        encoder0.encode(this.subPixelPrecisionBits, 236);
        
        encoder0.encode(this.maxComputeWorkGroupSize, 240, org.chromium.mojo.bindings.BindingsHelper.NOTHING_NULLABLE, 3);
        
        encoder0.encode(this.subTexelPrecisionBits, 248);
        
        encoder0.encode(this.mipmapPrecisionBits, 252);
        
        encoder0.encode(this.maxDrawIndexedIndexValue, 256);
        
        encoder0.encode(this.maxDrawIndirectCount, 260);
        
        encoder0.encode(this.maxSamplerLodBias, 264);
        
        encoder0.encode(this.maxSamplerAnisotropy, 268);
        
        encoder0.encode(this.maxViewports, 272);
        
        encoder0.encode(this.viewportSubPixelBits, 276);
        
        encoder0.encode(this.maxViewportDimensions, 280, org.chromium.mojo.bindings.BindingsHelper.NOTHING_NULLABLE, 2);
        
        encoder0.encode(this.viewportBoundsRange, 288, org.chromium.mojo.bindings.BindingsHelper.NOTHING_NULLABLE, 2);
        
        encoder0.encode(this.minMemoryMapAlignment, 296);
        
        encoder0.encode(this.minTexelBufferOffsetAlignment, 304);
        
        encoder0.encode(this.minUniformBufferOffsetAlignment, 312);
        
        encoder0.encode(this.minStorageBufferOffsetAlignment, 320);
        
        encoder0.encode(this.minTexelOffset, 328);
        
        encoder0.encode(this.maxTexelOffset, 332);
        
        encoder0.encode(this.minTexelGatherOffset, 336);
        
        encoder0.encode(this.maxTexelGatherOffset, 340);
        
        encoder0.encode(this.minInterpolationOffset, 344);
        
        encoder0.encode(this.maxInterpolationOffset, 348);
        
        encoder0.encode(this.subPixelInterpolationOffsetBits, 352);
        
        encoder0.encode(this.maxFramebufferWidth, 356);
        
        encoder0.encode(this.maxFramebufferHeight, 360);
        
        encoder0.encode(this.maxFramebufferLayers, 364);
        
        encoder0.encode(this.framebufferColorSampleCounts, 368);
        
        encoder0.encode(this.framebufferDepthSampleCounts, 372);
        
        encoder0.encode(this.framebufferStencilSampleCounts, 376);
        
        encoder0.encode(this.framebufferNoAttachmentsSampleCounts, 380);
        
        encoder0.encode(this.maxColorAttachments, 384);
        
        encoder0.encode(this.sampledImageColorSampleCounts, 388);
        
        encoder0.encode(this.sampledImageIntegerSampleCounts, 392);
        
        encoder0.encode(this.sampledImageDepthSampleCounts, 396);
        
        encoder0.encode(this.sampledImageStencilSampleCounts, 400);
        
        encoder0.encode(this.storageImageSampleCounts, 404);
        
        encoder0.encode(this.maxSampleMaskWords, 408);
        
        encoder0.encode(this.timestampComputeAndGraphics, 412, 0);
        
        encoder0.encode(this.strictLines, 412, 1);
        
        encoder0.encode(this.standardSampleLocations, 412, 2);
        
        encoder0.encode(this.timestampPeriod, 416);
        
        encoder0.encode(this.maxClipDistances, 420);
        
        encoder0.encode(this.maxCullDistances, 424);
        
        encoder0.encode(this.maxCombinedClipAndCullDistances, 428);
        
        encoder0.encode(this.discreteQueuePriorities, 432);
        
        encoder0.encode(this.pointSizeGranularity, 436);
        
        encoder0.encode(this.pointSizeRange, 440, org.chromium.mojo.bindings.BindingsHelper.NOTHING_NULLABLE, 2);
        
        encoder0.encode(this.lineWidthRange, 448, org.chromium.mojo.bindings.BindingsHelper.NOTHING_NULLABLE, 2);
        
        encoder0.encode(this.lineWidthGranularity, 456);
        
        encoder0.encode(this.optimalBufferCopyOffsetAlignment, 464);
        
        encoder0.encode(this.optimalBufferCopyRowPitchAlignment, 472);
        
        encoder0.encode(this.nonCoherentAtomSize, 480);
    }
}