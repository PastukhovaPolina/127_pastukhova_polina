public class Program {
    public static void main(String[] args) {
        System.out.println("Offset_hash_1");
        HashTable hashTable = new OffsetHashTable(13);

        hashTable.insert(58);
        hashTable.print();
        System.out.println();

        hashTable.insert(41);
        hashTable.print();
        System.out.println();

        hashTable.insert(48);
        hashTable.print();
        System.out.println();

        hashTable.insert(72);
        hashTable.print();
        System.out.println();

        hashTable.insert(23);
        hashTable.print();
        System.out.println();

        hashTable.insert(31);
        hashTable.print();
        System.out.println();

        hashTable.insert(26);
        hashTable.print();
        System.out.println();

        hashTable.insert(32);
        hashTable.print();
        System.out.println();

        hashTable.insert(93);
        hashTable.print();
        System.out.println();

        hashTable.insert(86);
        hashTable.print();
        System.out.println();

        hashTable.insert(24);
        hashTable.print();
        System.out.println();

        hashTable.insert(60);
        hashTable.print();
        System.out.println();

        System.out.println("Offset_hash_2");

        HashTable hashTable1 = new OffsetHashTable(19);

        hashTable1.insert(63);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(58);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(74);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(40);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(2);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(40);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(23);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(16);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(54);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(15);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(81);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(24);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(21);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(35);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(72);
        hashTable1.print();
        System.out.println();

        hashTable1.remove(72);
        hashTable1.print();
        System.out.println();

        hashTable1.remove(35);
        hashTable1.print();
        System.out.println();

        hashTable1.remove(58);
        hashTable1.print();
        System.out.println();

        hashTable1.remove(81);
        hashTable1.print();
        System.out.println();

        hashTable1.remove(23);
        hashTable1.print();
        System.out.println();

        System.out.println("Offset_hash_3");

        HashTable hashTable2 = new OffsetHashTable(19);

        hashTable2.insert(8);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(19);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(77);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(27);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(85);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(96);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(82);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(86);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(18);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(66);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(18);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(88);
        hashTable2.print();
        System.out.println();

        hashTable2.remove(66);
        hashTable2.print();
        System.out.println();

        hashTable2.remove(27);
        hashTable2.print();
        System.out.println();

        hashTable2.remove(77);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(11);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(28);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(17);
        hashTable2.print();
        System.out.println();

        hashTable2.remove(19);
        hashTable2.print();
        System.out.println();

        hashTable2.remove(86);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(6);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(98);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(45);
        hashTable2.print();
        System.out.println();

        hashTable2.remove(98);
        hashTable2.print();
        System.out.println();

        hashTable2.remove(17);
        hashTable2.print();
        System.out.println();

        hashTable2.remove(82);
        hashTable2.print();
        System.out.println();

        hashTable2.remove(11);
        hashTable2.print();
        System.out.println();

        hashTable2.remove(88);
        hashTable2.print();
        System.out.println();

        System.out.println("List_hash_1");
        HashTable listHashTable = new ListHashTable(13);

        listHashTable.insert(66);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(39);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(7);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(92);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(23);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(4);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(84);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(49);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(12);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(52);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(76);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(42);
        listHashTable.print();
        System.out.println();

        System.out.println("List_hash_2");

        HashTable listHashTable1 = new ListHashTable(19);

        listHashTable1.insert(1);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(98);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(99);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(63);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(18);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(33);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(43);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(7);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(92);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(17);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(21);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(46);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(36);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(28);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(2);
        listHashTable1.print();
        System.out.println();

        listHashTable1.remove(2);
        listHashTable1.print();
        System.out.println();

        listHashTable1.remove(1);
        listHashTable1.print();
        System.out.println();

        listHashTable1.remove(28);
        listHashTable1.print();
        System.out.println();

        listHashTable1.remove(17);
        listHashTable1.print();
        System.out.println();

        listHashTable1.remove(63);
        listHashTable1.print();
        System.out.println();

        System.out.println("List_hash_3");

        HashTable listHashTable2 = new ListHashTable(19);


        listHashTable2.insert(49);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(64);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(89);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(99);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(53);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(92);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(15);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(84);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(62);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(18);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(31);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(60);
        listHashTable2.print();
        System.out.println();

        listHashTable2.remove(84);
        listHashTable2.print();
        System.out.println();

        listHashTable2.remove(18);
        listHashTable2.print();
        System.out.println();

        listHashTable2.remove(60);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(3);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(59);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(36);
        listHashTable2.print();
        System.out.println();

        listHashTable2.remove(3);
        listHashTable2.print();
        System.out.println();

        listHashTable2.remove(31);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(36);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(16);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(86);
        listHashTable2.print();
        System.out.println();

        listHashTable2.remove(36);
        listHashTable2.print();
        System.out.println();

        listHashTable2.remove(15);
        listHashTable2.print();
        System.out.println();

        listHashTable2.remove(92);
        listHashTable2.print();
        System.out.println();

        listHashTable2.remove(49);
        listHashTable2.print();
        System.out.println();

        listHashTable2.remove(16);
        listHashTable2.print();
        System.out.println();
    }
}