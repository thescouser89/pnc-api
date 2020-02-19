package org.jboss.pnc.api.bifrost.dto;

import lombok.Getter;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;

/**
 * @author <a href="mailto:matejonnet@gmail.com">Matej Lazar</a>
 */
public class MetaData {

    @Getter
    private String md5Digest;

    public MetaData() {
    }

    public MetaData(String md5Digest) {
        this.md5Digest = md5Digest;
    }

    public static MetaData fromString(String json) {
        Jsonb jsonb = JsonbBuilder.create();
        return jsonb.fromJson(json, MetaData.class);
    }

}
