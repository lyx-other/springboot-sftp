package com.lyx.config;

import cn.hutool.extra.ssh.Sftp;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SftpConfig
{
	@Value("${sftp.host}")
	public String host;

	@Value("${sftp.port}")
	public Integer port;

	@Value("${sftp.user}")
	public String user;

	@Value("${sftp.passwd}")
	public String passwd;

	@Bean("sftp")
	public Sftp getSftp()
	{
		return new Sftp(host, port, user, passwd);
	}
}