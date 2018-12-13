package com.mask.blog.util;

import java.util.ArrayList;
import java.util.List;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

import org.apache.commons.lang3.StringUtils;

/**
 * ConstraintViolation处理器
 * @author Mask
 *
 */
public class ConstraintViolationExceptionHandler {
	public static String getMessage(ConstraintViolationException e) {
		List<String> msgList = new ArrayList<>();
		for (ConstraintViolation<?> constraintViolation : e.getConstraintViolations()) {
			msgList.add(constraintViolation.getMessage());
		}
		String messages = StringUtils.join(msgList.toArray(),";");
		return messages;
	}
}
