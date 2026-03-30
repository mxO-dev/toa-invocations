package com.toainvocations;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class ToaInvocationsPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(ToaInvocationsPlugin.class);
		RuneLite.main(args);
	}
}
