
package com.jagrosh.jmusicbot.commands.music;

import com.jagrosh.jmusicbot.Bot;


public class SCSearchCmd extends SearchCmd 
{
    public SCSearchCmd(Bot bot)
    {
        super(bot);
        this.searchPrefix = "scsearch:";
        this.name = "scsearch";
        this.help = "searches Soundcloud for a provided query";
        this.aliases = bot.getConfig().getAliases(this.name);
    }
}
