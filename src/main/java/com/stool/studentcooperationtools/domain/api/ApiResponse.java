package com.stool.studentcooperationtools.domain.api;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ApiResponse <T>{

    private HttpStatus status;
    private int code;
    private T data;

    private ApiResponse(final HttpStatus status, final int code, final T data) {
        this.status = status;
        this.code = code;
        this.data = data;
    }

    public static <T>ApiResponse<T> of(HttpStatus status, T data){
        return new ApiResponse<>(status, status.value(), data);
    }

}
