package cn.fxmpay.software.utils;

import cn.fxmpay.software.model.entity.User;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

/**
 * Jwt鉴权登录
 *
 * @author OneBird
 * @date 2022/5/20 9:07
 **/
public class Jwt {
    /**
     * 过期时间，30天
     */
    private static final long EXPIRE = 60000 * 60 * 24 * 30;

    /**
     * 加密秘钥
     */
    private static final String SECRET = "software";


    /**
     * 令牌前缀
     */
    private static final String TOKEN_PREFIX = "software";

    /**
     * subject
     */
    private static final String SUBJECT = "software";

    /**
     * 根据用户信息，生成令牌
     *
     * @param user
     * @return
     */
    public static String geneJsonWebToken(User user) {

        String token = Jwts.builder().setSubject(SUBJECT)

                .claim("id", user.getId())
                .claim("username", user.getUsername())
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRE))
                .signWith(SignatureAlgorithm.HS256, SECRET).compact();

        token = TOKEN_PREFIX + token;
        return token;
    }

    /**
     * 校验token的方法
     *
     * @param token
     * @return
     */
    public static Claims checkJWT(String token) {
        try {

            final Claims claims = Jwts.parser().setSigningKey(SECRET)
                    .parseClaimsJws(token.replace(TOKEN_PREFIX, "")).getBody();

            return claims;

        } catch (Exception e) {
            return null;
        }
    }

}
