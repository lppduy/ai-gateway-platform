package com.lppduy.aigateway.shared.utils;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Standard response model for API responses.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseResponse<T> {
    private int status;      // HTTP status code (e.g., 200, 404)
    private String message;  // Response message (e.g., "Success", "Rate limit exceeded")
    private T data;          // Response data (any DTO, or null in error cases)
}
