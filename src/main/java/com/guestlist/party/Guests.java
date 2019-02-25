package com.guestlist.party;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Guests extends JpaRepository<Guest, Long> {

}
