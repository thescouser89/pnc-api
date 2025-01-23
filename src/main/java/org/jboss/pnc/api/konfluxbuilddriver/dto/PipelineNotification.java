package org.jboss.pnc.api.konfluxbuilddriver.dto;

import org.jboss.pnc.api.dto.Request;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.jackson.Jacksonized;

@RequiredArgsConstructor
@Data
@Jacksonized
@Builder(builderClassName = "Builder")
public class PipelineNotification {
    private final String status;
    private final String buildId;
    private final Request completionCallback;
}
