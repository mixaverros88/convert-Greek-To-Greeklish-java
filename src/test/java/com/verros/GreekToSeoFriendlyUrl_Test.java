package com.verros;

import com.verros.common.GreekToSeoFriendlyUrl;
import org.junit.Test;
import static org.junit.Assert.*;

public class GreekToSeoFriendlyUrl_Test {

        @Test
        public void test1() {
                assertEquals(
                        GreekToSeoFriendlyUrl.convert("Τουρκικό υπουργείο Αμυνας: Εφτασαν στην Αγκυρα τα πρώτα τμήματα των S-400"),
                        "toyrkiko-ypoyrgeio-amynas-eftasan-stin-agkyra-ta-prwta-tmimata-twn-s-400");
        }

        @Test
        public void test2() {
                assertEquals(
                        GreekToSeoFriendlyUrl.convert("Σεληνιακή Έκλειψη Ιουλίου: Στενάχωρα γεγονότα και ξεκαθαρίσματα στις ανθρώπινες σχέσεις"),
                        "seliniaki-ekleipsi-ioylioy-stenaxwra-gegonota-kai-ksekatharismata-stis-anthrwpines-sxeseis");
        }

        @Test
        public void test3() {
                assertEquals(
                        GreekToSeoFriendlyUrl.convert("Παναθηναϊκός ΟΠΑΠ: Αναχωρεί για τις ΗΠΑ ο Παππάς"),
                        "panathinaikos-opap-anaxwrei-gia-tis-ipa-o-pappas");
        }

        @Test
        public void test4() {
                assertEquals(
                        GreekToSeoFriendlyUrl.convert("Παίρνεις μαζί το κινητό στην τουαλέτα; Σταμάτα το αμέσως! (pics+vid)"),
                        "pairneis-mazi-to-kinito-stin-toyaleta-stamata-to-amesws-pics-vid");
        }

        @Test
        public void test5() {
                assertEquals(
                        GreekToSeoFriendlyUrl.convert("Εγκλημα διαρκείας με το «112»"),
                        "egklima-diarkeias-me-to-112");
        }

        @Test
        public void test6() {
                assertEquals(
                        GreekToSeoFriendlyUrl.convert("ΥΠΕΞ: Η Ελλάδα αναγνωρίζει τον Γκουαϊδό ως μεταβατικό Πρόεδρο της Βενεζουέλας"),
                        "ypeks-i-ellada-anagnwrizei-ton-gkoyaido-ws-metabatiko-proedro-tis-benezoyelas");
        }

        @Test
        public void test7() {
                assertEquals(
                        GreekToSeoFriendlyUrl.convert("Η Χαλκιδική μετρά τις πληγές της - Ως το μεσημέρι η αποκατάσταση του δικτύου υψηλής τάσης (φωτογραφίες)"),
                        "i-xalkidiki-metra-tis-pliges-tis---ws-to-mesimeri-i-apokatastasi-toy-diktyoy-ypsilis-tasis-fwtografies");
        }

        @Test
        public void test8() {
                assertEquals(
                        GreekToSeoFriendlyUrl.convert("Η αγορά ομολόγων έχει τη δική της, σοφή, λογική"),
                        "i-agora-omologwn-exei-ti-diki-tis-sofi-logiki");
        }

        @Test
        public void test9() {
                assertEquals(
                        GreekToSeoFriendlyUrl.convert("Κούβα: Πρόβλεψη για μείωση 15% στις τουριστικές αφίξεις λόγω των νέων κυρώσεων των ΗΠΑ"),
                        "koyba-problepsi-gia-meiwsi-15-stis-toyristikes-afikseis-logw-twn-newn-kyrwsewn-twn-ipa");
        }

        @Test
        public void test10() {
                assertEquals(
                        GreekToSeoFriendlyUrl.convert("«Οιδίπους Τύραννος»: Η «Κ» στις πρόβες"),
                        "oidipoys-tyrannos-i-k-stis-probes");
        }
}
