# DataSecurity_Detyra2_ImplementationOfTheBealeCipherWhichUsesaTextDocumentAsaBook

Përshkrimi

Ky projekt demonstron një implementim të thjeshtë të Beale Cipher në gjuhën Java, duke përdorur një file tekstual (libër) si referencë për të enkriptuar dhe dekriptuar mesazhe. Ky program mundëson:

- Gjenerimin e një file me fjalë reference (book.txt)
- Enkriptimin e mesazheve duke përdorur pozicionet e fjalëve që fillojnë me shkronjat përkatëse
- Dekriptimin e mesazheve duke rikthyer shkronjat e para të fjalëve të identifikuara nga shifrat
- Trajtimin e karaktereve të panjohura me `0` gjatë enkriptimit dhe `?` gjatë dekriptimit

---


Struktura e Projektit

Struktura e projektit është e organizuar si më poshtë:

- /src/: përmban file-in kryesor të aplikacionit.
  - `Beale.java`

---

Funksionalitetet

- Gjenerimi i file-it të librit (book.txt)  
- Leximi i fjalëve nga file-i  
- Enkriptimi i mesazhit sipas Beale Cipher  
- Dekriptimi i mesazhit sipas Beale Cipher  
- Trajtimi i karaktereve të panjohura me `0` dhe `?`

---

Përmbajtja e Klasës

 `Beale.java`

Përmban metodat:

- `generateBookFile(String fileName)`  
  → Gjeneron një file `book.txt` me fjalë të ndara me hapësirë.

- `loadBook(String fileName)`  
  → Lexon fjalët nga file dhe i ruan në një ArrayList.

- `encrypy(String message, ArrayList<String> bookWords)`  
  → Enkripton mesazhin duke kthyer shkronjat në pozicionet e fjalëve që fillojnë me ato shkronja.

- `decrypy(String cipherText, ArrayList<String> bookWords)`  
  → Dekriptoi mesazhin duke kthyer numrat në shkronjat e para të fjalëve përkatëse.

- `main(String[] args)`  
  → Teston funksionalitetet kryesore të aplikacionit.

---

Shembull Ekzekutimi

plaintext = "Hello World!"
Encrypted Message: 8 1 13 13 15 0 23 15 18 13 4
Decrypted Message: helloworld?

Klononi
git clone https://github.com/Ermir-Meziu/DataSecurity_Detyra2_ImplementationOfTheBealeCipherWhichUsesaTextDocumentAsaBook

Punuan
Erzana Beqaj
Ermir Mëziu
Kaltrinë Heta

Licensa
Ky projekt është nën licensën MIT.