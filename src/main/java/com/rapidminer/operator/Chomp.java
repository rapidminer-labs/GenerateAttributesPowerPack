package com.rapidminer.operator;

import org.apache.commons.lang.StringUtils;

import com.rapidminer.tools.expression.internal.function.AbstractArbitraryStringInputStringOutputFunction;

public class Chomp extends AbstractArbitraryStringInputStringOutputFunction {

	public Chomp() {
		super("text_transformation.chomp", 1);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected String compute(String... values) {
		// TODO Auto-generated method stub
		return StringUtils.chomp(values[0]);
	}

	@Override
	protected void checkNumberOfInputs(int length) {
		// TODO Auto-generated method stub

	}

}
