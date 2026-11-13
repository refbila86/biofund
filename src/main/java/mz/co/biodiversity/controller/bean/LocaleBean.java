package mz.co.biodiversity.controller.bean;

import java.io.Serializable;
import java.util.Locale;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("localeBean")
@Scope("session")
public class LocaleBean implements Serializable
{

	private static final long serialVersionUID = 1L;

	private Locale locale = Locale.of("pt");

	public Locale getLocale()
	{
		return locale;
	}

	public String getLanguage()
	{
		return locale.getLanguage();
	}

	public Locale resolve(String language)
	{
		if ("en".equals(language))
		{
			this.locale = Locale.of("en");
		} else if ("pt".equals(language))
		{
			this.locale = Locale.of("pt");
		}
		return locale;
	}
}
