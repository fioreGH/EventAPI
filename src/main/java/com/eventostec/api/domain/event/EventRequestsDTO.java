package com.eventostec.api.domain.event;

import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

public record EventRequestsDTO(String title, String Description, Long date, String city, String state,
                               Boolean remote, String eventUrl, MultipartFile image) {
}
