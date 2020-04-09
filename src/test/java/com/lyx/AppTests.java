package com.lyx;

import cn.hutool.extra.ssh.Sftp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AppTests
{
	@Autowired
	@Qualifier("sftp")
	private Sftp sftp;

	@Test
	void contextLoads()
	{
		System.out.println(sftp);
	}
}