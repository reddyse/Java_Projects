/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Career;
import java.util.ArrayList;
/**
 *
 * @author prane
 */
public class ResumeHistory 
{
    private ArrayList <Resume> resumeHistory;
    
    public ResumeHistory() 
    {
        resumeHistory = new ArrayList<Resume>();
    }  
      public ArrayList<Resume> getResumeHistory() 
    {
        return resumeHistory;
    }
    public void setResumeHistory(ArrayList<Resume> ResumeHistory) 
    {
        this.resumeHistory = resumeHistory;
    } 

    public Resume addResume()
    {
        Resume vs = new Resume();
        resumeHistory.add(vs);
        return vs;
    }
    
    public void deleteResume(Resume v)
    {
        resumeHistory.remove(v);
    }
}
    