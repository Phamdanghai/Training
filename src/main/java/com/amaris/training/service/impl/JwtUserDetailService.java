//package com.amaris.training.service.impl;
//
//import com.amaris.training.doman.Account;
//import com.amaris.training.dto.request.RegisterAccount;
//import com.amaris.training.repository.AccountRepository;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import java.util.HashSet;
//import java.util.Set;
//
//@Service
//public class JwtUserDetailService implements UserDetailsService {
//    final AccountRepository accountRepository;
//
//    public JwtUserDetailService(AccountRepository accountRepository) {
//        this.accountRepository = accountRepository;
//    }
//
//    @Override
//    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
//        Account account = accountRepository.findByEmailAccount(email);
//        if (account == null) {
//            throw new UsernameNotFoundException("Invalid User");
//        } else {
//            Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
////            for (Role role : user.getRoles()){
////                grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_"+role.getName()));
////            }
//            return new org
//                    .springframework
//                    .security
//                    .core
//                    .userdetails
//                    .User(account.getEmail(), account.getPassword(), grantedAuthorities);
//        }
//    }
//}
