package dirtysearch;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import javax.swing.JFileChooser;


public class Search {
    File[] files;
    Window window;
    
    public File[] listFiles(Window window) {
        
        this.window = window;

    
    // System.out.println("TESTSTART");
    
            String fileExtn = window.getjTextFieldEXTN();
            

            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File("C:\\"));
           // fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
            fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            int resultNum = fileChooser.showOpenDialog(window);
            
            File[] files = null;
        
            if (resultNum == JFileChooser.APPROVE_OPTION) {
                
                File selectedFile = fileChooser.getSelectedFile();
                File dirPath = selectedFile;
                String SEARCH_STRING = window.getjTextFieldSEARCH();
                String result = "";
                
                
                files = dirPath.listFiles(new FileFilter() {
                    @Override
                    public boolean accept(File pathname) {
                        String name = pathname.getName().toLowerCase();
                        return name.endsWith("."+fileExtn ) && pathname.isFile() ;
                    }
                });
                
                                ArrayList<String> names = new ArrayList<String>();
                          for(int i=0;i<files.length;i++){
                             
                             names.add(files[i].toString());
                             
                              
                          } 
                                
                //  names.addAll(Arrays.asList(files.toString()));
                  
                  
                
                
                window.setjTextFieldPARSE(names);
                
                
                
//                ArrayList<String> names = new ArrayList<String>();
//                  names.addAll(Arrays.asList(dirPath.list()));
                  
               // String[] names = dirPath.list();
              
             

         
            }
         return files;
    }

    public void parseFiles(File[] files) {
        this.window = window;
        this.files = files;
        
        
               String result = "";
                String SEARCH_STRING = window.getjTextFieldSEARCH();
        
             ArrayList<String> fileContentsList = new ArrayList<String>();
                int fileCount = 0;
                
                ArrayList<String> foundInList = new ArrayList<String>();
                
                String foundIn = "NONE";
                
                for (int i = 0; i < files.length; i++) {
                    try {
                        System.out.println("PARSING FILE:   " + files[i]);
                        //result = result + ("\nPARSING FILE:   " + files[i]);
                   
                        window.setjTextFieldRESULT(result);
                        String fileContent = new String(Files.readAllBytes(Paths.get(files[i].toString())));
                        fileContentsList.add(fileContent);
                        fileCount++;
                      
                        if (fileContentsList.get(i).contains(SEARCH_STRING)
                                || fileContentsList.get(i).contains(SEARCH_STRING.toLowerCase()) 
                                || fileContentsList.get(i).contains(SEARCH_STRING.toUpperCase())) {
                            
                            foundInList.add(files[i].toString());
                            foundIn =files[i].toString() + "/n";
                           

                        }
                    } catch (IOException ex) {
                     
                    }
                }

                System.out.println("SUCCESSFULLY PARSED " + fileCount + " FILES.");
                result = result + "\n\nSUCCESSFULLY PARSED " + fileCount + " FILES.";
               window.setjTextFieldRESULT(result);
                System.out.println("\n\nMATCH FOUND IN: " + foundIn + foundInList);
                result = result + "\n\nMATCH FOUND IN: \n\n";
                int count =1;
                for(int i = 0; i<foundInList.size();i++){
                    result = result + count + ".      " + foundInList.get(i) + "\n";
                    count++;
                }
              
                   count =1;
          if(foundInList.size()== 0){
              result = "NO MATCHES FOUND";
          }      
          window.setjTextFieldRESULT(result);
          
         

                
            }

    public File[] getFiles() {
        return files;
    }

    

    }


