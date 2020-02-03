package org.jboss.pnc.api.bifrost.dto;

import lombok.Getter;

/**
 * @author <a href="mailto:matejonnet@gmail.com">Matej Lazar</a>
 */
public class MetaData {

    @Getter
    private String md5Digest;

    public MetaData(String md5Digest) {
        this.md5Digest = md5Digest;
    }
}
