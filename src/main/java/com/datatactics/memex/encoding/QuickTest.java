package com.datatactics.memex.encoding;

import java.nio.charset.Charset;

public class QuickTest {

	public static void main(String[] args) 
	{
		System.out.println(System.getProperty("file.encoding"));
		System.out.println(Charset.defaultCharset());
	}
}
