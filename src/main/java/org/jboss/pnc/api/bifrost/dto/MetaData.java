package org.jboss.pnc.api.bifrost.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author <a href="mailto:matejonnet@gmail.com">Matej Lazar</a>
 */
public class MetaData {

    @Getter
    @Setter
    private String md5Digest;

    public MetaData() {
    }

    public MetaData(String md5Digest) {
        this.md5Digest = md5Digest;
    }

}
