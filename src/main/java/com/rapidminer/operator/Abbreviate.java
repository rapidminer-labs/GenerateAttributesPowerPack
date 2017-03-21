package com.rapidminer.operator;

/*
 * Author : Bhupendra Patil
 */
import org.apache.commons.lang.StringUtils;

import com.rapidminer.tools.expression.internal.function.text.AbstractStringIntegerInputStringOutputFunction;

public class Abbreviate extends AbstractStringIntegerInputStringOutputFunction {

	public Abbreviate() {
		super("text_transformation.abbreviate", 2);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected String compute(String text, double maxWidth) {
		return StringUtils.abbreviate(text, (int) maxWidth);

	}

}
