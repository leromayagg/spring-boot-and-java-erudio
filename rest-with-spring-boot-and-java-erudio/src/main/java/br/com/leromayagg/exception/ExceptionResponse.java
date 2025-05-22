package br.com.leromayagg.exception;

import java.util.Date;

public record ExceptionResponse(Date timestamp, String mensage, String details) {}
