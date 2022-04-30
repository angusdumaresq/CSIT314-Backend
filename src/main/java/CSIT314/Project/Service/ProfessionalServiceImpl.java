package CSIT314.Project.Service;

import CSIT314.Project.Model.Professional;

public interface ProfessionalServiceImpl {
    public Professional getProfessionalById(Long id);
    public Professional createProfessional(Professional newProfessional);
    public Professional updateProfessional(Professional professional, Long id);
    public void deleteProfessional(Long id);
}