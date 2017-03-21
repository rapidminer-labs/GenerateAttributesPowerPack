package com.rapidminer.operator;

import org.apache.commons.lang.StringUtils;

import com.rapidminer.tools.expression.internal.function.AbstractArbitraryStringInputStringOutputFunction;

public class Capitalize extends
		AbstractArbitraryStringInputStringOutputFunction {

	public Capitalize() {
		super("text_transformation.capitalize", 1);
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("deprecation")
	@Override
	protected String compute(String... values) {
		// TODO Auto-generated method stub
		return StringUtils.capitalise(values[0]);
	}

	@Override
	protected void checkNumberOfInputs(int length) {
		// TODO Auto-generated method stub

	}

}
