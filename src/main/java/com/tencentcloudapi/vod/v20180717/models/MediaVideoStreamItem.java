/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaVideoStreamItem  extends AbstractModel{

    /**
    * 视频流的码率，单位：bps。
    */
    @SerializedName("Bitrate")
    @Expose
    private Integer Bitrate;

    /**
    * 视频流的高度，单位：px。
    */
    @SerializedName("Height")
    @Expose
    private Integer Height;

    /**
    * 视频流的宽度，单位：px。
    */
    @SerializedName("Width")
    @Expose
    private Integer Width;

    /**
    * 视频流的编码格式，例如 h264。
    */
    @SerializedName("Codec")
    @Expose
    private String Codec;

    /**
    * 帧率，单位：hz。
    */
    @SerializedName("Fps")
    @Expose
    private Integer Fps;

    /**
     * 获取视频流的码率，单位：bps。
     * @return Bitrate 视频流的码率，单位：bps。
     */
    public Integer getBitrate() {
        return this.Bitrate;
    }

    /**
     * 设置视频流的码率，单位：bps。
     * @param Bitrate 视频流的码率，单位：bps。
     */
    public void setBitrate(Integer Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * 获取视频流的高度，单位：px。
     * @return Height 视频流的高度，单位：px。
     */
    public Integer getHeight() {
        return this.Height;
    }

    /**
     * 设置视频流的高度，单位：px。
     * @param Height 视频流的高度，单位：px。
     */
    public void setHeight(Integer Height) {
        this.Height = Height;
    }

    /**
     * 获取视频流的宽度，单位：px。
     * @return Width 视频流的宽度，单位：px。
     */
    public Integer getWidth() {
        return this.Width;
    }

    /**
     * 设置视频流的宽度，单位：px。
     * @param Width 视频流的宽度，单位：px。
     */
    public void setWidth(Integer Width) {
        this.Width = Width;
    }

    /**
     * 获取视频流的编码格式，例如 h264。
     * @return Codec 视频流的编码格式，例如 h264。
     */
    public String getCodec() {
        return this.Codec;
    }

    /**
     * 设置视频流的编码格式，例如 h264。
     * @param Codec 视频流的编码格式，例如 h264。
     */
    public void setCodec(String Codec) {
        this.Codec = Codec;
    }

    /**
     * 获取帧率，单位：hz。
     * @return Fps 帧率，单位：hz。
     */
    public Integer getFps() {
        return this.Fps;
    }

    /**
     * 设置帧率，单位：hz。
     * @param Fps 帧率，单位：hz。
     */
    public void setFps(Integer Fps) {
        this.Fps = Fps;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Bitrate", this.Bitrate);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Codec", this.Codec);
        this.setParamSimple(map, prefix + "Fps", this.Fps);

    }
}
