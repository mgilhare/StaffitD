import jakarta.persistence.Id;

import java.util.Date;

public class Staff {

    @Id
    private String emp_email;
    private String emp_name;
    private String team_name;
    private String level;
    private Date start_date;
    private Date end_date;
    private String FY24CO;
    private String combined_role;
    private String project_role;
    private String msa_role;
    private String actual_workstream;
    private  String actual_featureteam;
    private String organisation;
    private String location;
    private Date updated_rolloff_date;
    private String comments;

    public String getEmp_email() {
        return emp_email;
    }

    public void setEmp_email(String emp_email) {
        this.emp_email = emp_email;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getTeam_name() {
        return team_name;
    }

    public void setTeam_name(String team_name) {
        this.team_name = team_name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public String getFY24CO() {
        return FY24CO;
    }

    public void setFY24CO(String FY24CO) {
        this.FY24CO = FY24CO;
    }

    public String getCombined_role() {
        return combined_role;
    }

    public void setCombined_role(String combined_role) {
        this.combined_role = combined_role;
    }

    public String getProject_role() {
        return project_role;
    }

    public void setProject_role(String project_role) {
        this.project_role = project_role;
    }

    public String getMsa_role() {
        return msa_role;
    }

    public void setMsa_role(String msa_role) {
        this.msa_role = msa_role;
    }

    public String getActual_workstream() {
        return actual_workstream;
    }

    public void setActual_workstream(String actual_workstream) {
        this.actual_workstream = actual_workstream;
    }

    public String getActual_featureteam() {
        return actual_featureteam;
    }

    public void setActual_featureteam(String actual_featureteam) {
        this.actual_featureteam = actual_featureteam;
    }

    public String getOrganisation() {
        return organisation;
    }

    public void setOrganisation(String organisation) {
        this.organisation = organisation;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getUpdated_rolloff_date() {
        return updated_rolloff_date;
    }

    public void setUpdated_rolloff_date(Date updated_rolloff_date) {
        this.updated_rolloff_date = updated_rolloff_date;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
