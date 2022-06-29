package com.jojoldu.book.springboot.web;

import com.jojoldu.book.springboot.domain.posts.PostsRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;


//@RunWith(SpringRunner.class)
// 위에서 강조된 부분인 RunWith, Before, org.junit.Before, org.junit.runner부분이 Junit5에서는 없다. 따라서 Junit을 활용한 테스트를 할 수 없었는데 검색을 통해 이렇게 바꿨더니 정상적인 테스트를 진행할 수 있었다.
@ExtendWith(SpringExtension.class)  //@RunWith(SpringRunner.class) 대신 사용
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PostsApiControllerTest {
    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    private PostsRepository postsRepository;

    @AfterEach
    public void tearDown() throws Exception{
        postsRepository.deleteAll();
    }


}
