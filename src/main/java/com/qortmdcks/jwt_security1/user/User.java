package com.qortmdcks.jwt_security1.user;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User implements UserDetails {
    @Id
    @GeneratedValue
    private Integer id;
    private String firstname;
    private String lastname;
    private String email;
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() { // 계정이 가지고 있는 권한 목록 확인
        return null;
    }

    @Override
    public String getUsername() { // 계정 이름 리턴
        return null;
    }

    @Override
    public boolean isAccountNonExpired() { // 계정이 만료됐는지 리턴 -> true는 완료되지 않음 의미
        return false;
    }

    @Override
    public boolean isAccountNonLocked() { // 계정이 잠겨있는지 리턴 -> true는 잠기지 않음
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() { //비밀번호가 만료됐는지 리턴 -> true는 만료X 의미
        return false;
    }

    @Override
    public boolean isEnabled() { // 계정이 활성화돼 있는지 리턴 -> tru는 활성화 상태 의미
        return false;
    }
}
