package com.lppduy.aigateway.shared.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 * ResponseUtils provides static methods to create standardized
 * ResponseEntity<BaseResponse<T>> for both success and error responses.
 */
public class ResponseUtils {

    /**
     * Returns a 200 OK response with default message "Success".
     */
    public static <T> ResponseEntity<BaseResponse<T>> ok(T data) {
        return ResponseEntity.ok(new BaseResponse<T>(200, "Success", data));
    }

    /**
     * Returns a 200 OK response with a custom message.
     */
    public static <T> ResponseEntity<BaseResponse<T>> ok(String message, T data) {
        return ResponseEntity.ok(new BaseResponse<T>(200, message, data));
    }

    /**
     * Returns a custom 2xx response (e.g., 201 Created) with a message and data.
     */
    public static <T> ResponseEntity<BaseResponse<T>> status(int status, String message, T data) {
        return ResponseEntity.status(status).body(new BaseResponse<T>(status, message, data));
    }

    /**
     * Returns a 201 Created response with default message "Created".
     */
    public static <T> ResponseEntity<BaseResponse<T>> created(T data) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new BaseResponse<T>(201, "Created", data));
    }

    public static <T> ResponseEntity<BaseResponse<T>> created(String message, T data) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new BaseResponse<>(201, message, data));
    }

    /**
     * Returns a 204 No Content response.
     */
    public static ResponseEntity<BaseResponse<Void>> noContent() {
        return ResponseEntity.status(HttpStatus.NO_CONTENT)
                .body(new BaseResponse<Void>(204, "No Content", null));
    }

    /**
     * Returns an error response using a given HttpStatus and message.
     * Data is set to null.
     */
    public static <T> ResponseEntity<BaseResponse<T>> error(HttpStatus status, String message) {
        return ResponseEntity.status(status)
                .body(new BaseResponse<T>(status.value(), message, null));
    }

    /**
     * Returns an error response with a custom status, message, and data.
     */
    public static <T> ResponseEntity<BaseResponse<T>> error(int status, String message, T data) {
        return ResponseEntity.status(status)
                .body(new BaseResponse<T>(status, message, data));
    }

    /**
     * Returns an error response using HttpStatus, message, and data.
     */
    public static <T> ResponseEntity<BaseResponse<T>> error(HttpStatus status, String message, T data) {
        return ResponseEntity.status(status)
                .body(new BaseResponse<T>(status.value(), message, data));
    }
}
