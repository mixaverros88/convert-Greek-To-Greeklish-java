# Convert string from greek to greeklish

A simple java class in order to convert a post title to seo friendly url.

The convert method of GreekToSeoFriendlyUrl class takes as an input a string and returns a string making the necessaries transformations.

### Examples

GreekToSeoFriendlyUrl.convert("Τουρκικό υπουργείο Αμυνας: Εφτασαν στην Αγκυρα τα πρώτα τμήματα των S-400")<br/>
Result : toyrkiko-ypoyrgeio-amynas-eftasan-stin-agkyra-ta-prwta-tmimata-twn-s-400<br/>

GreekToSeoFriendlyUrl.convert("Σεληνιακή Έκλειψη Ιουλίου: Στενάχωρα γεγονότα και ξεκαθαρίσματα στις ανθρώπινες σχέσεις")<br/>
Result : seliniaki-ekleipsi-ioylioy-stenaxwra-gegonota-kai-ksekatharismata-stis-anthrwpines-sxeseis<br/>

GreekToSeoFriendlyUrl.convert("Παναθηναϊκός ΟΠΑΠ: Αναχωρεί για τις ΗΠΑ ο Παππάς")<br/>
Result : panathinaikos-opap-anaxwrei-gia-tis-ipa-o-pappas<br/>

GreekToSeoFriendlyUrl.convert("Παίρνεις μαζί το κινητό στην τουαλέτα; Σταμάτα το αμέσως! (pics+vid)")<br/>
Result : pairneis-mazi-to-kinito-stin-toyaleta-stamata-to-amesws-pics-vid<br/>

GreekToSeoFriendlyUrl.convert("Εγκλημα διαρκείας με το «112»")<br/>
Result : egklima-diarkeias-me-to-112<br/>

GreekToSeoFriendlyUrl.convert("ΥΠΕΞ: Η Ελλάδα αναγνωρίζει τον Γκουαϊδό ως μεταβατικό Πρόεδρο της Βενεζουέλας")<br/>
Result : ypeks-i-ellada-anagnwrizei-ton-gkoyaido-ws-metabatiko-proedro-tis-benezoyelas<br/>

GreekToSeoFriendlyUrl.convert("Η Χαλκιδική μετρά τις πληγές της - Ως το μεσημέρι η αποκατάσταση του δικτύου υψηλής τάσης (φωτογραφίες)")<br/>
Result : i-xalkidiki-metra-tis-pliges-tis---ws-to-mesimeri-i-apokatastasi-toy-diktyoy-ypsilis-tasis-fwtografies<br/>

GreekToSeoFriendlyUrl.convert("Η αγορά ομολόγων έχει τη δική της, σοφή, λογική")<br/>
Result : i-agora-omologwn-exei-ti-diki-tis-sofi-logiki<br/>

GreekToSeoFriendlyUrl.convert("Κούβα: Πρόβλεψη για μείωση 15% στις τουριστικές αφίξεις λόγω των νέων κυρώσεων των ΗΠΑ")<br/>
Result : koyba-problepsi-gia-meiwsi-15-stis-toyristikes-afikseis-logw-twn-newn-kyrwsewn-twn-ipa<br/>

GreekToSeoFriendlyUrl.convert("«Οιδίπους Τύραννος»: Η «Κ» στις πρόβες")<br/>
Result : oidipoys-tyrannos-i-k-stis-probes<br/>

GreekToSeoFriendlyUrl.convert("Σκίτσο του Ανδρέα Πετρουλάκη (11.07.19)")<br/>
Result : skitso-toy-andrea-petroylaki-110719<br/>

GreekToSeoFriendlyUrl.convert("Flashback στη 12η Ιουλίου")<br/>
Result : flashback-sti-12i-ioylioy<br/>

GreekToSeoFriendlyUrl.convert("Ανακαίνιση με... βραζιλιάνικο αέρα")<br/>
Result : anakainisi-me-brazilianiko-aera<br/>

GreekToSeoFriendlyUrl.convert("Αποστολή: Γράμμα από το Καντίκιοϊ")<br/>
Result : apostoli-gramma-apo-to-kantikioi<br/>
