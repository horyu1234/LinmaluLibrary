package com.linmalu.library.api;

import java.io.File;
import java.util.Set;

import org.bukkit.configuration.file.YamlConfiguration;

public class LinmaluConfig
{
	private final File file;
	private final YamlConfiguration config;

	public LinmaluConfig(File file)
	{
		this.file = file;
		config = YamlConfiguration.loadConfiguration(file);
	}
	public void setData(String key, Object value)
	{
		config.set(key, value);
		save();
	}
	public boolean isData(String key)
	{
		return config.isSet(key);
	}
	public Set<String> getKeys(boolean deep)
	{
		return config.getKeys(deep);
	}
	public <T> T getData(String key, Class<T> clazz)
	{
		return clazz.cast(config.get(key));
	}
	public void removeData(String key)
	{
		config.set(key, null);
		save();
	}
	public void clearData()
	{
		config.getKeys(true).forEach(key -> removeData(key));
	}
	private void save()
	{
		try
		{
			config.save(file);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
