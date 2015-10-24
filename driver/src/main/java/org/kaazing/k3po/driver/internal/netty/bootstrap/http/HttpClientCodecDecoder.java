/*
 * Copyright 2014, Kaazing Corporation. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.kaazing.k3po.driver.internal.netty.bootstrap.http;

import org.jboss.netty.channel.ChannelEvent;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.handler.codec.http.HttpClientCodec;
import org.jboss.netty.handler.codec.http.HttpResponseDecoder;

class HttpClientCodecDecoder extends HttpResponseDecoder {
    private final HttpClientCodec codec;

    HttpClientCodecDecoder(HttpClientCodec codec) {
        this.codec = codec;
    }

    @Override
    public void handleUpstream(ChannelHandlerContext ctx, ChannelEvent e)
            throws Exception {
        codec.handleUpstream(ctx, e);
    }

}
