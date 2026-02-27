package com.linkedin.users_service.service;


public interface ExperienceService {
    void createExperience(CreateExperienceDto createExperienceDto, long userId);
    void updateExperienceDto(UpdateExperienceDto updateExperienceDto, long experienceId, long userId);
    List<ExperienceDto> getAllExperiencesByUserId(long userId);
    ExperienceDto getExperienceById(long experienceId);
    void deleteExperienceById(long experienceId, long userId, boolean isAdmin);
}
