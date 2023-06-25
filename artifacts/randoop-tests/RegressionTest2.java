import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", "hi!", false, "");
        java.lang.Object obj6 = option5.getType();
        boolean boolean8 = option5.equals((java.lang.Object) 0);
        org.apache.commons.cli.Options options9 = options0.addOption(option5);
        org.apache.commons.cli.OptionGroup optionGroup10 = new org.apache.commons.cli.OptionGroup();
        org.apache.commons.cli.Options options11 = options9.addOptionGroup(optionGroup10);
        org.apache.commons.cli.Option option16 = new org.apache.commons.cli.Option("", "hi!", false, "");
        java.lang.Object obj17 = option16.getType();
        boolean boolean19 = option16.equals((java.lang.Object) 0);
        boolean boolean20 = option16.hasLongOpt();
        org.apache.commons.cli.Options options21 = options9.addOption(option16);
        org.apache.commons.cli.DefaultParser defaultParser22 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options23 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray30 = new java.lang.String[] { "org.apache.commons.cli.UnrecognizedOptionException: hi!", "hi!", "org.apache.commons.cli.UnrecognizedOptionException: hi!", "hi!", "", "org.apache.commons.cli.UnrecognizedOptionException: hi!" };
        java.util.Properties properties31 = null;
        org.apache.commons.cli.CommandLine commandLine32 = defaultParser22.parse(options23, strArray30, properties31);
        java.lang.String str34 = commandLine32.getOptionValue("hi!");
        java.lang.Object obj36 = commandLine32.getParsedOptionValue("");
        java.lang.String[] strArray38 = commandLine32.getOptionValues('4');
        java.lang.String[] strArray39 = commandLine32.getArgs();
        org.apache.commons.cli.Option option44 = new org.apache.commons.cli.Option("", "hi!", false, "");
        java.lang.Object obj45 = option44.getType();
        java.util.Properties properties46 = commandLine32.getOptionProperties(option44);
        org.apache.commons.cli.Options options47 = options9.addOption(option44);
        java.util.List<java.lang.String> strList49 = options9.getMatchingOptions("[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options53 = options9.addOption("", false, "org.apache.commons.cli.MissingOptionException: Missing required options: ");
        java.util.List<java.lang.String> strList55 = options53.getMatchingOptions("[ option:  hi!  :: org.apache.commons.cli.UnrecognizedOptionException: hi! :: class java.lang.String ]");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options59 = options53.addOption("org.apache.commons.cli.ParseException: []", true, "[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option 'org.apache.commons.cli.ParseException: []' contains an illegal character : '.'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "class java.lang.String");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "class java.lang.String");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(options21);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(commandLine32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(strArray38);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertEquals(obj45.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj45), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj45), "class java.lang.String");
        org.junit.Assert.assertNotNull(properties46);
        org.junit.Assert.assertNotNull(options47);
        org.junit.Assert.assertNotNull(strList49);
        org.junit.Assert.assertNotNull(options53);
        org.junit.Assert.assertNotNull(strList55);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("", true, "[ option:  hi!  ::  :: class java.lang.String ]");
        java.lang.String str4 = option3.getArgName();
        int int5 = option3.getArgs();
        boolean boolean6 = option3.hasArg();
        option3.setArgName("org.apache.commons.cli.UnrecognizedOptionException: []");
        java.lang.String str9 = option3.getValue();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        org.apache.commons.cli.Option.Builder builder0 = org.apache.commons.cli.Option.builder();
        org.apache.commons.cli.Option.Builder builder1 = builder0.required();
        org.apache.commons.cli.Option.Builder builder2 = builder1.hasArg();
        org.apache.commons.cli.Option.Builder builder3 = builder1.required();
        org.apache.commons.cli.Option.Builder builder4 = builder3.required();
        org.apache.commons.cli.Option.Builder builder6 = builder3.optionalArg(false);
        org.apache.commons.cli.Option.Builder builder8 = builder6.longOpt("");
        org.apache.commons.cli.Option.Builder builder10 = builder8.desc("org.apache.commons.cli.UnrecognizedOptionException: []");
        org.apache.commons.cli.Option.Builder builder12 = builder8.numberOfArgs(0);
        org.apache.commons.cli.Option.Builder builder14 = builder8.optionalArg(true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.apache.commons.cli.CommandLine.Builder builder0 = new org.apache.commons.cli.CommandLine.Builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.build();
        org.apache.commons.cli.CommandLine commandLine2 = builder0.build();
        org.apache.commons.cli.CommandLine.Builder builder4 = builder0.addArg("[ option:  hi!  ::  :: class java.lang.String ]");
        org.apache.commons.cli.Options options5 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option10 = new org.apache.commons.cli.Option("", "hi!", false, "");
        java.lang.Object obj11 = option10.getType();
        boolean boolean13 = option10.equals((java.lang.Object) 0);
        org.apache.commons.cli.Options options14 = options5.addOption(option10);
        org.apache.commons.cli.OptionGroup optionGroup15 = new org.apache.commons.cli.OptionGroup();
        org.apache.commons.cli.Options options16 = options14.addOptionGroup(optionGroup15);
        org.apache.commons.cli.Option option21 = new org.apache.commons.cli.Option("", "hi!", false, "");
        java.lang.Object obj22 = option21.getType();
        boolean boolean24 = option21.equals((java.lang.Object) 0);
        boolean boolean25 = option21.hasLongOpt();
        org.apache.commons.cli.Options options26 = options14.addOption(option21);
        java.lang.String str27 = options26.toString();
        org.apache.commons.cli.OptionGroup optionGroup28 = new org.apache.commons.cli.OptionGroup();
        java.lang.String str29 = optionGroup28.getSelected();
        org.apache.commons.cli.Option option34 = new org.apache.commons.cli.Option("", "hi!", false, "");
        java.lang.Object obj35 = option34.getType();
        java.lang.String str36 = option34.getArgName();
        option34.setValueSeparator('#');
        optionGroup28.setSelected(option34);
        org.apache.commons.cli.Options options40 = options26.addOption(option34);
        org.apache.commons.cli.CommandLine.Builder builder41 = builder0.addOption(option34);
        char char42 = option34.getValueSeparator();
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNotNull(commandLine2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "class java.lang.String");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(options14);
        org.junit.Assert.assertNotNull(options16);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "class java.lang.String");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(options26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]" + "'", str27, "[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertEquals(obj35.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj35), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj35), "class java.lang.String");
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(options40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertTrue("'" + char42 + "' != '" + '#' + "'", char42 == '#');
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.apache.commons.cli.UnrecognizedOptionException unrecognizedOptionException1 = new org.apache.commons.cli.UnrecognizedOptionException("[ option:  [- ]  ::  :: class java.lang.String ]");
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "hi!", false, "");
        java.lang.Object obj5 = option4.getType();
        java.lang.String str7 = option4.getValue(10);
        java.lang.String str9 = option4.getValue((int) '#');
        java.util.List<java.lang.String> strList10 = option4.getValuesList();
        option4.setArgs((int) '\000');
        java.lang.String str13 = option4.getArgName();
        boolean boolean14 = option4.isRequired();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = option4.getId();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "class java.lang.String");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray8 = new java.lang.String[] { "org.apache.commons.cli.UnrecognizedOptionException: hi!", "hi!", "org.apache.commons.cli.UnrecognizedOptionException: hi!", "hi!", "", "org.apache.commons.cli.UnrecognizedOptionException: hi!" };
        java.util.Properties properties9 = null;
        org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.parse(options1, strArray8, properties9);
        java.lang.String str12 = commandLine10.getOptionValue("hi!");
        java.lang.Object obj14 = commandLine10.getParsedOptionValue("");
        java.lang.String[] strArray16 = commandLine10.getOptionValues('4');
        java.lang.String[] strArray17 = commandLine10.getArgs();
        org.apache.commons.cli.Option option22 = new org.apache.commons.cli.Option("", "hi!", false, "");
        java.lang.Object obj23 = option22.getType();
        java.util.Properties properties24 = commandLine10.getOptionProperties(option22);
        org.apache.commons.cli.DefaultParser defaultParser25 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options26 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray33 = new java.lang.String[] { "org.apache.commons.cli.UnrecognizedOptionException: hi!", "hi!", "org.apache.commons.cli.UnrecognizedOptionException: hi!", "hi!", "", "org.apache.commons.cli.UnrecognizedOptionException: hi!" };
        java.util.Properties properties34 = null;
        org.apache.commons.cli.CommandLine commandLine35 = defaultParser25.parse(options26, strArray33, properties34);
        java.util.List<java.lang.String> strList36 = commandLine35.getArgList();
        org.apache.commons.cli.Option option41 = new org.apache.commons.cli.Option("", "hi!", false, "");
        java.lang.Object obj42 = option41.getType();
        boolean boolean44 = option41.equals((java.lang.Object) 0);
        option41.setArgName("");
        java.lang.Object obj47 = commandLine35.getParsedOptionValue(option41);
        java.lang.String[] strArray48 = commandLine10.getOptionValues(option41);
        java.lang.Object obj49 = option41.clone();
        option41.setArgs((int) (short) 10);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(commandLine10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "class java.lang.String");
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(commandLine35);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertEquals(obj42.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj42), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj42), "class java.lang.String");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(strArray48);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertEquals(obj49.toString(), "[ option:  hi!  ::  :: class java.lang.String ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj49), "[ option:  hi!  ::  :: class java.lang.String ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj49), "[ option:  hi!  ::  :: class java.lang.String ]");
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray8 = new java.lang.String[] { "org.apache.commons.cli.UnrecognizedOptionException: hi!", "hi!", "org.apache.commons.cli.UnrecognizedOptionException: hi!", "hi!", "", "org.apache.commons.cli.UnrecognizedOptionException: hi!" };
        java.util.Properties properties9 = null;
        org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.parse(options1, strArray8, properties9);
        java.util.List<java.lang.String> strList11 = commandLine10.getArgList();
        java.lang.String str14 = commandLine10.getOptionValue('#', "org.apache.commons.cli.UnrecognizedOptionException: hi!");
        org.apache.commons.cli.Options options15 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option20 = new org.apache.commons.cli.Option("", "hi!", false, "");
        java.lang.Object obj21 = option20.getType();
        boolean boolean23 = option20.equals((java.lang.Object) 0);
        org.apache.commons.cli.Options options24 = options15.addOption(option20);
        org.apache.commons.cli.OptionGroup optionGroup25 = new org.apache.commons.cli.OptionGroup();
        org.apache.commons.cli.Options options26 = options24.addOptionGroup(optionGroup25);
        org.apache.commons.cli.Option option31 = new org.apache.commons.cli.Option("", "hi!", false, "");
        java.lang.Object obj32 = option31.getType();
        boolean boolean34 = option31.equals((java.lang.Object) 0);
        boolean boolean35 = option31.hasLongOpt();
        org.apache.commons.cli.Options options36 = options24.addOption(option31);
        boolean boolean37 = option31.hasLongOpt();
        java.lang.String str39 = commandLine10.getOptionValue(option31, "org.apache.commons.cli.UnrecognizedOptionException: hi!");
        org.apache.commons.cli.OptionGroup optionGroup40 = new org.apache.commons.cli.OptionGroup();
        boolean boolean41 = optionGroup40.isRequired();
        java.lang.String str42 = optionGroup40.getSelected();
        optionGroup40.setRequired(false);
        boolean boolean45 = optionGroup40.isRequired();
        org.apache.commons.cli.Option option50 = new org.apache.commons.cli.Option("", "hi!", false, "");
        java.lang.Object obj51 = option50.getType();
        java.lang.String str52 = option50.getArgName();
        java.util.List<java.lang.String> strList53 = option50.getValuesList();
        option50.setArgName("[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        optionGroup40.setSelected(option50);
        java.lang.String str58 = commandLine10.getOptionValue(option50, "[ option:    ::  :: class java.lang.String ]");
        java.lang.String str59 = option50.getOpt();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(commandLine10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.apache.commons.cli.UnrecognizedOptionException: hi!" + "'", str14, "org.apache.commons.cli.UnrecognizedOptionException: hi!");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "class java.lang.String");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(options24);
        org.junit.Assert.assertNotNull(options26);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "class java.lang.String");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(options36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "org.apache.commons.cli.UnrecognizedOptionException: hi!" + "'", str39, "org.apache.commons.cli.UnrecognizedOptionException: hi!");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertEquals(obj51.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj51), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj51), "class java.lang.String");
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(strList53);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "[ option:    ::  :: class java.lang.String ]" + "'", str58, "[ option:    ::  :: class java.lang.String ]");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray8 = new java.lang.String[] { "org.apache.commons.cli.UnrecognizedOptionException: hi!", "hi!", "org.apache.commons.cli.UnrecognizedOptionException: hi!", "hi!", "", "org.apache.commons.cli.UnrecognizedOptionException: hi!" };
        java.util.Properties properties9 = null;
        org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.parse(options1, strArray8, properties9);
        org.apache.commons.cli.Option option12 = options1.getOption("org.apache.commons.cli.MissingOptionException: Missing required options: ");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection13 = options1.getOptions();
        org.apache.commons.cli.DefaultParser defaultParser14 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options15 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray22 = new java.lang.String[] { "org.apache.commons.cli.UnrecognizedOptionException: hi!", "hi!", "org.apache.commons.cli.UnrecognizedOptionException: hi!", "hi!", "", "org.apache.commons.cli.UnrecognizedOptionException: hi!" };
        java.util.Properties properties23 = null;
        org.apache.commons.cli.CommandLine commandLine24 = defaultParser14.parse(options15, strArray22, properties23);
        java.lang.String str26 = commandLine24.getOptionValue("hi!");
        java.lang.Object obj28 = commandLine24.getParsedOptionValue("");
        java.lang.String[] strArray30 = commandLine24.getOptionValues('4');
        org.apache.commons.cli.Options options31 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option36 = new org.apache.commons.cli.Option("", "hi!", false, "");
        java.lang.Object obj37 = option36.getType();
        boolean boolean39 = option36.equals((java.lang.Object) 0);
        org.apache.commons.cli.Options options40 = options31.addOption(option36);
        java.lang.String str42 = option36.getValue("hi!");
        java.util.List<java.lang.String> strList43 = option36.getValuesList();
        int int44 = option36.getArgs();
        java.lang.String str46 = commandLine24.getOptionValue(option36, "org.apache.commons.cli.UnrecognizedOptionException: hi!");
        option36.setRequired(true);
        org.apache.commons.cli.Options options49 = options1.addOption(option36);
        java.lang.String str50 = option36.getOpt();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(commandLine10);
        org.junit.Assert.assertNull(option12);
        org.junit.Assert.assertNotNull(optionCollection13);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(commandLine24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(strArray30);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertEquals(obj37.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj37), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj37), "class java.lang.String");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(options40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "org.apache.commons.cli.UnrecognizedOptionException: hi!" + "'", str46, "org.apache.commons.cli.UnrecognizedOptionException: hi!");
        org.junit.Assert.assertNotNull(options49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        org.apache.commons.cli.CommandLine.Builder builder0 = new org.apache.commons.cli.CommandLine.Builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.build();
        org.apache.commons.cli.CommandLine commandLine2 = builder0.build();
        org.apache.commons.cli.CommandLine.Builder builder4 = builder0.addArg("[ option:  hi!  ::  :: class java.lang.String ]");
        org.apache.commons.cli.CommandLine.Builder builder6 = builder0.addArg("[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Option option11 = new org.apache.commons.cli.Option("", "hi!", false, "");
        java.lang.Object obj12 = option11.getType();
        boolean boolean14 = option11.equals((java.lang.Object) 0);
        option11.setArgName("");
        java.lang.String[] strArray17 = option11.getValues();
        org.apache.commons.cli.CommandLine.Builder builder18 = builder0.addOption(option11);
        org.apache.commons.cli.CommandLine commandLine19 = builder0.build();
        org.apache.commons.cli.Option.Builder builder20 = org.apache.commons.cli.Option.builder();
        org.apache.commons.cli.Option.Builder builder22 = builder20.argName("[]");
        org.apache.commons.cli.Option.Builder builder23 = builder20.hasArg();
        org.apache.commons.cli.Option.Builder builder25 = builder20.valueSeparator(' ');
        org.apache.commons.cli.Option.Builder builder27 = builder25.option("");
        org.apache.commons.cli.Option.Builder builder29 = builder27.desc("org.apache.commons.cli.UnrecognizedOptionException: []");
        org.apache.commons.cli.Option option30 = builder29.build();
        org.apache.commons.cli.CommandLine.Builder builder31 = builder0.addOption(option30);
        option30.setValueSeparator('4');
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNotNull(commandLine2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "class java.lang.String");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(commandLine19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(option30);
        org.junit.Assert.assertNotNull(builder31);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        org.apache.commons.cli.AlreadySelectedException alreadySelectedException1 = new org.apache.commons.cli.AlreadySelectedException("org.apache.commons.cli.MissingOptionException: Missing required options: ");
        org.apache.commons.cli.MissingOptionException missingOptionException3 = new org.apache.commons.cli.MissingOptionException("org.apache.commons.cli.UnrecognizedOptionException: hi!");
        org.apache.commons.cli.UnrecognizedOptionException unrecognizedOptionException5 = new org.apache.commons.cli.UnrecognizedOptionException("[ option:  hi!  ::  :: class java.lang.String ]");
        java.lang.String str6 = unrecognizedOptionException5.getOption();
        missingOptionException3.addSuppressed((java.lang.Throwable) unrecognizedOptionException5);
        alreadySelectedException1.addSuppressed((java.lang.Throwable) unrecognizedOptionException5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray8 = new java.lang.String[] { "org.apache.commons.cli.UnrecognizedOptionException: hi!", "hi!", "org.apache.commons.cli.UnrecognizedOptionException: hi!", "hi!", "", "org.apache.commons.cli.UnrecognizedOptionException: hi!" };
        java.util.Properties properties9 = null;
        org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.parse(options1, strArray8, properties9);
        java.lang.String str12 = commandLine10.getOptionValue("hi!");
        java.lang.Object obj14 = commandLine10.getParsedOptionValue("");
        java.lang.String[] strArray16 = commandLine10.getOptionValues('4');
        java.lang.String[] strArray17 = commandLine10.getArgs();
        org.apache.commons.cli.Option option22 = new org.apache.commons.cli.Option("", "hi!", false, "");
        java.lang.Object obj23 = option22.getType();
        java.util.Properties properties24 = commandLine10.getOptionProperties(option22);
        org.apache.commons.cli.DefaultParser defaultParser25 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options26 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray33 = new java.lang.String[] { "org.apache.commons.cli.UnrecognizedOptionException: hi!", "hi!", "org.apache.commons.cli.UnrecognizedOptionException: hi!", "hi!", "", "org.apache.commons.cli.UnrecognizedOptionException: hi!" };
        java.util.Properties properties34 = null;
        org.apache.commons.cli.CommandLine commandLine35 = defaultParser25.parse(options26, strArray33, properties34);
        java.util.List<java.lang.String> strList36 = commandLine35.getArgList();
        org.apache.commons.cli.Option option41 = new org.apache.commons.cli.Option("", "hi!", false, "");
        java.lang.Object obj42 = option41.getType();
        boolean boolean44 = option41.equals((java.lang.Object) 0);
        option41.setArgName("");
        java.lang.Object obj47 = commandLine35.getParsedOptionValue(option41);
        java.lang.String[] strArray48 = commandLine10.getOptionValues(option41);
        boolean boolean49 = option41.hasOptionalArg();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(commandLine10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "class java.lang.String");
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(commandLine35);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertEquals(obj42.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj42), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj42), "class java.lang.String");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        org.apache.commons.cli.AlreadySelectedException alreadySelectedException1 = new org.apache.commons.cli.AlreadySelectedException("");
        org.apache.commons.cli.MissingOptionException missingOptionException3 = new org.apache.commons.cli.MissingOptionException("org.apache.commons.cli.UnrecognizedOptionException: hi!");
        org.apache.commons.cli.AlreadySelectedException alreadySelectedException5 = new org.apache.commons.cli.AlreadySelectedException("");
        org.apache.commons.cli.OptionGroup optionGroup6 = alreadySelectedException5.getOptionGroup();
        missingOptionException3.addSuppressed((java.lang.Throwable) alreadySelectedException5);
        alreadySelectedException1.addSuppressed((java.lang.Throwable) missingOptionException3);
        java.lang.String str9 = missingOptionException3.toString();
        org.junit.Assert.assertNull(optionGroup6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.commons.cli.MissingOptionException: org.apache.commons.cli.UnrecognizedOptionException: hi!" + "'", str9, "org.apache.commons.cli.MissingOptionException: org.apache.commons.cli.UnrecognizedOptionException: hi!");
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", "hi!", false, "");
        java.lang.Object obj6 = option5.getType();
        boolean boolean8 = option5.equals((java.lang.Object) 0);
        org.apache.commons.cli.Options options9 = options0.addOption(option5);
        org.apache.commons.cli.OptionGroup optionGroup10 = new org.apache.commons.cli.OptionGroup();
        org.apache.commons.cli.Options options11 = options9.addOptionGroup(optionGroup10);
        java.lang.String str12 = optionGroup10.getSelected();
        org.apache.commons.cli.Options options13 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option18 = new org.apache.commons.cli.Option("", "hi!", false, "");
        java.lang.Object obj19 = option18.getType();
        boolean boolean21 = option18.equals((java.lang.Object) 0);
        org.apache.commons.cli.Options options22 = options13.addOption(option18);
        java.lang.String str24 = option18.getValue("hi!");
        int int25 = option18.getArgs();
        option18.setDescription("hi!");
        java.lang.String str28 = option18.getLongOpt();
        optionGroup10.setSelected(option18);
        java.util.Collection<java.lang.String> strCollection30 = optionGroup10.getNames();
        java.util.Collection<java.lang.String> strCollection31 = optionGroup10.getNames();
        org.apache.commons.cli.Option option36 = new org.apache.commons.cli.Option("", "hi!", false, "");
        java.lang.Object obj37 = option36.getType();
        java.lang.String str38 = option36.getArgName();
        boolean boolean39 = option36.hasArgName();
        boolean boolean40 = option36.hasArg();
        option36.setOptionalArg(false);
        org.apache.commons.cli.AlreadySelectedException alreadySelectedException43 = new org.apache.commons.cli.AlreadySelectedException(optionGroup10, option36);
        option36.setValueSeparator('a');
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "class java.lang.String");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "class java.lang.String");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(options22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(strCollection30);
        org.junit.Assert.assertNotNull(strCollection31);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertEquals(obj37.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj37), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj37), "class java.lang.String");
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        java.lang.String str2 = optionGroup0.getSelected();
        optionGroup0.setRequired(false);
        java.util.Collection<java.lang.String> strCollection5 = optionGroup0.getNames();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection6 = optionGroup0.getOptions();
        java.lang.String str7 = optionGroup0.getSelected();
        org.apache.commons.cli.DefaultParser defaultParser8 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options9 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray16 = new java.lang.String[] { "org.apache.commons.cli.UnrecognizedOptionException: hi!", "hi!", "org.apache.commons.cli.UnrecognizedOptionException: hi!", "hi!", "", "org.apache.commons.cli.UnrecognizedOptionException: hi!" };
        java.util.Properties properties17 = null;
        org.apache.commons.cli.CommandLine commandLine18 = defaultParser8.parse(options9, strArray16, properties17);
        java.lang.String str20 = commandLine18.getOptionValue("hi!");
        java.lang.Object obj22 = commandLine18.getParsedOptionValue("");
        java.lang.String[] strArray24 = commandLine18.getOptionValues('4');
        java.lang.String[] strArray25 = commandLine18.getArgs();
        org.apache.commons.cli.Option option30 = new org.apache.commons.cli.Option("", "hi!", false, "");
        java.lang.Object obj31 = option30.getType();
        java.util.Properties properties32 = commandLine18.getOptionProperties(option30);
        boolean boolean33 = option30.hasArg();
        optionGroup0.setSelected(option30);
        java.lang.String str35 = optionGroup0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strCollection5);
        org.junit.Assert.assertNotNull(optionCollection6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(commandLine18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(strArray24);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "class java.lang.String");
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "[]" + "'", str35, "[]");
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "hi!", false, "");
        java.lang.Object obj5 = option4.getType();
        java.lang.String str7 = option4.getValue(10);
        java.lang.String str9 = option4.getValue((int) '#');
        boolean boolean10 = option4.hasArgs();
        option4.setRequired(true);
        boolean boolean13 = option4.hasArg();
        java.util.List<java.lang.String> strList14 = option4.getValuesList();
        boolean boolean15 = option4.hasArg();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "class java.lang.String");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "hi!", false, "");
        java.lang.Object obj5 = option4.getType();
        java.lang.String str6 = option4.getArgName();
        boolean boolean7 = option4.hasArgName();
        boolean boolean8 = option4.hasOptionalArg();
        option4.setDescription("[ option:  [- ]  ::  :: class java.lang.String ]");
        // The following exception was thrown during execution in test generation
        try {
            int int11 = option4.getId();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "class java.lang.String");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", "hi!", false, "");
        java.lang.Object obj6 = option5.getType();
        boolean boolean8 = option5.equals((java.lang.Object) 0);
        org.apache.commons.cli.Options options9 = options0.addOption(option5);
        org.apache.commons.cli.OptionGroup optionGroup10 = new org.apache.commons.cli.OptionGroup();
        org.apache.commons.cli.Options options11 = options9.addOptionGroup(optionGroup10);
        java.lang.String str12 = optionGroup10.getSelected();
        boolean boolean13 = optionGroup10.isRequired();
        java.lang.String str14 = optionGroup10.toString();
        java.lang.String str15 = optionGroup10.getSelected();
        java.lang.String str16 = optionGroup10.toString();
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "class java.lang.String");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.apache.commons.cli.Option.Builder builder0 = org.apache.commons.cli.Option.builder();
        org.apache.commons.cli.Option.Builder builder1 = builder0.required();
        org.apache.commons.cli.Option.Builder builder2 = builder1.hasArg();
        org.apache.commons.cli.Option.Builder builder3 = builder2.valueSeparator();
        org.apache.commons.cli.Option.Builder builder5 = builder2.required(false);
        org.apache.commons.cli.Option.Builder builder7 = builder5.longOpt("[ option:  hi!  :: org.apache.commons.cli.UnrecognizedOptionException: hi! :: class java.lang.String ]");
        org.apache.commons.cli.Option.Builder builder8 = builder5.hasArgs();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        org.apache.commons.cli.UnrecognizedOptionException unrecognizedOptionException1 = new org.apache.commons.cli.UnrecognizedOptionException("");
        java.lang.String str2 = unrecognizedOptionException1.getOption();
        org.apache.commons.cli.AlreadySelectedException alreadySelectedException4 = new org.apache.commons.cli.AlreadySelectedException("org.apache.commons.cli.MissingOptionException: Missing required options: ");
        unrecognizedOptionException1.addSuppressed((java.lang.Throwable) alreadySelectedException4);
        java.lang.String str6 = unrecognizedOptionException1.getOption();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        org.apache.commons.cli.DefaultParser defaultParser1 = new org.apache.commons.cli.DefaultParser(false);
        org.apache.commons.cli.Options options2 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.DefaultParser defaultParser3 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options4 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option9 = new org.apache.commons.cli.Option("", "hi!", false, "");
        java.lang.Object obj10 = option9.getType();
        boolean boolean12 = option9.equals((java.lang.Object) 0);
        org.apache.commons.cli.Options options13 = options4.addOption(option9);
        org.apache.commons.cli.DefaultParser defaultParser14 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options15 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray22 = new java.lang.String[] { "org.apache.commons.cli.UnrecognizedOptionException: hi!", "hi!", "org.apache.commons.cli.UnrecognizedOptionException: hi!", "hi!", "", "org.apache.commons.cli.UnrecognizedOptionException: hi!" };
        java.util.Properties properties23 = null;
        org.apache.commons.cli.CommandLine commandLine24 = defaultParser14.parse(options15, strArray22, properties23);
        org.apache.commons.cli.CommandLine commandLine25 = defaultParser3.parse(options4, strArray22);
        org.apache.commons.cli.DefaultParser defaultParser26 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options27 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray34 = new java.lang.String[] { "org.apache.commons.cli.UnrecognizedOptionException: hi!", "hi!", "org.apache.commons.cli.UnrecognizedOptionException: hi!", "hi!", "", "org.apache.commons.cli.UnrecognizedOptionException: hi!" };
        java.util.Properties properties35 = null;
        org.apache.commons.cli.CommandLine commandLine36 = defaultParser26.parse(options27, strArray34, properties35);
        java.lang.String str38 = commandLine36.getOptionValue("hi!");
        java.lang.Object obj40 = commandLine36.getParsedOptionValue("");
        java.lang.String[] strArray42 = commandLine36.getOptionValues('4');
        java.lang.String[] strArray43 = commandLine36.getArgs();
        org.apache.commons.cli.Option option48 = new org.apache.commons.cli.Option("", "hi!", false, "");
        java.lang.Object obj49 = option48.getType();
        java.util.Properties properties50 = commandLine36.getOptionProperties(option48);
        org.apache.commons.cli.CommandLine commandLine52 = defaultParser1.parse(options2, strArray22, properties50, true);
        java.lang.String str54 = commandLine52.getOptionValue("org.apache.commons.cli.MissingOptionException: Missing required options: ");
        java.util.List<java.lang.String> strList55 = commandLine52.getArgList();
        java.lang.Object obj57 = commandLine52.getParsedOptionValue("org.apache.commons.cli.MissingOptionException: org.apache.commons.cli.UnrecognizedOptionException: hi!");
        java.lang.String str59 = commandLine52.getOptionValue("org.apache.commons.cli.UnrecognizedOptionException: org.apache.commons.cli.AlreadySelectedException: ");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "class java.lang.String");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(commandLine24);
        org.junit.Assert.assertNotNull(commandLine25);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(commandLine36);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(strArray42);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertEquals(obj49.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj49), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj49), "class java.lang.String");
        org.junit.Assert.assertNotNull(properties50);
        org.junit.Assert.assertNotNull(commandLine52);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(strList55);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(str59);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        org.apache.commons.cli.UnrecognizedOptionException unrecognizedOptionException1 = new org.apache.commons.cli.UnrecognizedOptionException("org.apache.commons.cli.UnrecognizedOptionException: hi!");
        java.lang.String str2 = unrecognizedOptionException1.getOption();
        java.lang.Throwable[] throwableArray3 = unrecognizedOptionException1.getSuppressed();
        java.lang.Throwable[] throwableArray4 = unrecognizedOptionException1.getSuppressed();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        boolean boolean1 = optionGroup0.isRequired();
        org.apache.commons.cli.DefaultParser defaultParser2 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray10 = new java.lang.String[] { "org.apache.commons.cli.UnrecognizedOptionException: hi!", "hi!", "org.apache.commons.cli.UnrecognizedOptionException: hi!", "hi!", "", "org.apache.commons.cli.UnrecognizedOptionException: hi!" };
        java.util.Properties properties11 = null;
        org.apache.commons.cli.CommandLine commandLine12 = defaultParser2.parse(options3, strArray10, properties11);
        java.util.List<java.lang.String> strList13 = commandLine12.getArgList();
        org.apache.commons.cli.Option option18 = new org.apache.commons.cli.Option("", "hi!", false, "");
        java.lang.Object obj19 = option18.getType();
        boolean boolean21 = option18.equals((java.lang.Object) 0);
        option18.setArgName("");
        java.lang.Object obj24 = commandLine12.getParsedOptionValue(option18);
        optionGroup0.setSelected(option18);
        boolean boolean26 = optionGroup0.isRequired();
        java.lang.String str27 = optionGroup0.getSelected();
        java.util.Collection<java.lang.String> strCollection28 = optionGroup0.getNames();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(commandLine12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "class java.lang.String");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(strCollection28);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option6 = new org.apache.commons.cli.Option("", "hi!", false, "");
        java.lang.Object obj7 = option6.getType();
        boolean boolean9 = option6.equals((java.lang.Object) 0);
        org.apache.commons.cli.Options options10 = options1.addOption(option6);
        org.apache.commons.cli.OptionGroup optionGroup11 = new org.apache.commons.cli.OptionGroup();
        org.apache.commons.cli.Options options12 = options10.addOptionGroup(optionGroup11);
        java.lang.String str13 = options10.toString();
        org.apache.commons.cli.Option option18 = new org.apache.commons.cli.Option("", "hi!", false, "");
        java.lang.Object obj19 = option18.getType();
        java.lang.String str20 = option18.getArgName();
        boolean boolean21 = option18.hasArgName();
        boolean boolean22 = option18.hasArg();
        org.apache.commons.cli.OptionGroup optionGroup23 = options10.getOptionGroup(option18);
        org.apache.commons.cli.DefaultParser defaultParser24 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options25 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray32 = new java.lang.String[] { "org.apache.commons.cli.UnrecognizedOptionException: hi!", "hi!", "org.apache.commons.cli.UnrecognizedOptionException: hi!", "hi!", "", "org.apache.commons.cli.UnrecognizedOptionException: hi!" };
        java.util.Properties properties33 = null;
        org.apache.commons.cli.CommandLine commandLine34 = defaultParser24.parse(options25, strArray32, properties33);
        org.apache.commons.cli.CommandLine commandLine36 = defaultParser0.parse(options10, strArray32, true);
        org.apache.commons.cli.Options options40 = options10.addOption("", false, "hi!");
        org.apache.commons.cli.Options options43 = options10.addOption("", "[ option:  hi!  ::  :: class java.lang.String ]");
        org.apache.commons.cli.Option option45 = options10.getOption("org.apache.commons.cli.MissingOptionException: org.apache.commons.cli.MissingOptionException: Missing required options: ");
        org.apache.commons.cli.Option option50 = new org.apache.commons.cli.Option("", "hi!", false, "");
        java.lang.Object obj51 = option50.getType();
        java.lang.String str52 = option50.getArgName();
        boolean boolean53 = option50.hasArgName();
        option50.setLongOpt("");
        org.apache.commons.cli.OptionGroup optionGroup56 = options10.getOptionGroup(option50);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "class java.lang.String");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]" + "'", str13, "[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "class java.lang.String");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(optionGroup23);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(commandLine34);
        org.junit.Assert.assertNotNull(commandLine36);
        org.junit.Assert.assertNotNull(options40);
        org.junit.Assert.assertNotNull(options43);
        org.junit.Assert.assertNull(option45);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertEquals(obj51.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj51), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj51), "class java.lang.String");
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(optionGroup56);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", "hi!", false, "");
        java.lang.Object obj6 = option5.getType();
        boolean boolean8 = option5.equals((java.lang.Object) 0);
        org.apache.commons.cli.Options options9 = options0.addOption(option5);
        org.apache.commons.cli.OptionGroup optionGroup10 = new org.apache.commons.cli.OptionGroup();
        org.apache.commons.cli.Options options11 = options9.addOptionGroup(optionGroup10);
        java.lang.String str12 = options9.toString();
        org.apache.commons.cli.Option option17 = new org.apache.commons.cli.Option("", "hi!", false, "");
        java.lang.Object obj18 = option17.getType();
        java.lang.String str19 = option17.getArgName();
        boolean boolean20 = option17.hasArgName();
        boolean boolean21 = option17.hasArg();
        org.apache.commons.cli.OptionGroup optionGroup22 = options9.getOptionGroup(option17);
        boolean boolean24 = options9.hasLongOption("org.apache.commons.cli.UnrecognizedOptionException: hi!");
        java.util.Collection<org.apache.commons.cli.Option> optionCollection25 = options9.getOptions();
        boolean boolean27 = options9.hasLongOption("[]");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "class java.lang.String");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]" + "'", str12, "[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "class java.lang.String");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(optionGroup22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(optionCollection25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "hi!", false, "");
        java.lang.Object obj5 = option4.getType();
        java.lang.String str6 = option4.getArgName();
        boolean boolean7 = option4.hasArgName();
        option4.setLongOpt("");
        boolean boolean10 = option4.hasArgs();
        java.util.List<java.lang.String> strList11 = option4.getValuesList();
        boolean boolean12 = option4.hasArgName();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "class java.lang.String");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", "hi!", false, "");
        java.lang.Object obj6 = option5.getType();
        boolean boolean8 = option5.equals((java.lang.Object) 0);
        org.apache.commons.cli.Options options9 = options0.addOption(option5);
        org.apache.commons.cli.OptionGroup optionGroup10 = new org.apache.commons.cli.OptionGroup();
        org.apache.commons.cli.Options options11 = options9.addOptionGroup(optionGroup10);
        org.apache.commons.cli.Option option16 = new org.apache.commons.cli.Option("", "hi!", false, "");
        java.lang.Object obj17 = option16.getType();
        boolean boolean19 = option16.equals((java.lang.Object) 0);
        boolean boolean20 = option16.hasLongOpt();
        org.apache.commons.cli.Options options21 = options9.addOption(option16);
        org.apache.commons.cli.Option option26 = new org.apache.commons.cli.Option("", "hi!", false, "");
        java.lang.Object obj27 = option26.getType();
        boolean boolean29 = option26.equals((java.lang.Object) 0);
        boolean boolean30 = option26.hasLongOpt();
        java.lang.String str31 = option26.toString();
        org.apache.commons.cli.OptionGroup optionGroup32 = options21.getOptionGroup(option26);
        java.lang.String str33 = option26.getLongOpt();
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "class java.lang.String");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "class java.lang.String");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(options21);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "class java.lang.String");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "[ option:  hi!  ::  :: class java.lang.String ]" + "'", str31, "[ option:  hi!  ::  :: class java.lang.String ]");
        org.junit.Assert.assertNull(optionGroup32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", "hi!", false, "");
        java.lang.Object obj6 = option5.getType();
        boolean boolean8 = option5.equals((java.lang.Object) 0);
        org.apache.commons.cli.Options options9 = options0.addOption(option5);
        org.apache.commons.cli.OptionGroup optionGroup10 = new org.apache.commons.cli.OptionGroup();
        org.apache.commons.cli.Options options11 = options9.addOptionGroup(optionGroup10);
        org.apache.commons.cli.Option option16 = new org.apache.commons.cli.Option("", "hi!", false, "");
        java.lang.Object obj17 = option16.getType();
        boolean boolean19 = option16.equals((java.lang.Object) 0);
        boolean boolean20 = option16.hasLongOpt();
        org.apache.commons.cli.Options options21 = options9.addOption(option16);
        org.apache.commons.cli.DefaultParser defaultParser22 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options23 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray30 = new java.lang.String[] { "org.apache.commons.cli.UnrecognizedOptionException: hi!", "hi!", "org.apache.commons.cli.UnrecognizedOptionException: hi!", "hi!", "", "org.apache.commons.cli.UnrecognizedOptionException: hi!" };
        java.util.Properties properties31 = null;
        org.apache.commons.cli.CommandLine commandLine32 = defaultParser22.parse(options23, strArray30, properties31);
        java.lang.String str34 = commandLine32.getOptionValue("hi!");
        java.lang.Object obj36 = commandLine32.getParsedOptionValue("");
        java.lang.String[] strArray38 = commandLine32.getOptionValues('4');
        java.lang.String[] strArray39 = commandLine32.getArgs();
        org.apache.commons.cli.Option option44 = new org.apache.commons.cli.Option("", "hi!", false, "");
        java.lang.Object obj45 = option44.getType();
        java.util.Properties properties46 = commandLine32.getOptionProperties(option44);
        org.apache.commons.cli.Options options47 = options9.addOption(option44);
        java.util.List<java.lang.String> strList49 = options9.getMatchingOptions("[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options53 = options9.addOption("", false, "org.apache.commons.cli.MissingOptionException: Missing required options: ");
        boolean boolean55 = options53.hasOption("org.apache.commons.cli.UnrecognizedOptionException: hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options60 = options53.addOption("org.apache.commons.cli.UnrecognizedOptionException: []", "[ option:  hi!  :: org.apache.commons.cli.UnrecognizedOptionException: hi! :: class java.lang.String ]", false, "[ Options: [ short {=[ option:   :: [ option:  hi!  ::  :: class java.lang.String ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option 'org.apache.commons.cli.UnrecognizedOptionException: []' contains an illegal character : '.'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "class java.lang.String");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "class java.lang.String");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(options21);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(commandLine32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(strArray38);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertEquals(obj45.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj45), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj45), "class java.lang.String");
        org.junit.Assert.assertNotNull(properties46);
        org.junit.Assert.assertNotNull(options47);
        org.junit.Assert.assertNotNull(strList49);
        org.junit.Assert.assertNotNull(options53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        org.apache.commons.cli.Option.Builder builder0 = org.apache.commons.cli.Option.builder();
        org.apache.commons.cli.Option.Builder builder1 = builder0.required();
        org.apache.commons.cli.Option.Builder builder2 = builder1.hasArg();
        org.apache.commons.cli.Option.Builder builder3 = builder2.valueSeparator();
        org.apache.commons.cli.Option.Builder builder5 = builder2.numberOfArgs(1);
        org.apache.commons.cli.Option.Builder builder6 = builder2.valueSeparator();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        org.apache.commons.cli.CommandLine.Builder builder0 = new org.apache.commons.cli.CommandLine.Builder();
        org.apache.commons.cli.CommandLine commandLine1 = builder0.build();
        org.apache.commons.cli.CommandLine commandLine2 = builder0.build();
        org.apache.commons.cli.CommandLine.Builder builder4 = builder0.addArg("[ option:  hi!  ::  :: class java.lang.String ]");
        org.apache.commons.cli.Option option9 = new org.apache.commons.cli.Option("", "hi!", false, "");
        java.lang.Object obj10 = option9.getType();
        java.lang.String str11 = option9.getArgName();
        option9.setValueSeparator('#');
        boolean boolean14 = option9.hasOptionalArg();
        org.apache.commons.cli.CommandLine.Builder builder15 = builder4.addOption(option9);
        org.apache.commons.cli.Options options16 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option21 = new org.apache.commons.cli.Option("", "hi!", false, "");
        java.lang.Object obj22 = option21.getType();
        boolean boolean24 = option21.equals((java.lang.Object) 0);
        org.apache.commons.cli.Options options25 = options16.addOption(option21);
        java.lang.String str27 = option21.getValue("hi!");
        int int28 = option21.getArgs();
        option21.setDescription("hi!");
        java.lang.String str31 = option21.getLongOpt();
        org.apache.commons.cli.CommandLine.Builder builder32 = builder4.addOption(option21);
        org.apache.commons.cli.CommandLine commandLine33 = builder4.build();
        org.apache.commons.cli.CommandLine commandLine34 = builder4.build();
        org.apache.commons.cli.CommandLine.Builder builder36 = builder4.addArg("");
        org.apache.commons.cli.CommandLine.Builder builder38 = builder4.addArg("[ Options: [ short {=[ option:   :: org.apache.commons.cli.MissingOptionException: Missing required options:  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(commandLine1);
        org.junit.Assert.assertNotNull(commandLine2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "class java.lang.String");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "class java.lang.String");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(options25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(commandLine33);
        org.junit.Assert.assertNotNull(commandLine34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", "hi!", false, "");
        java.lang.Object obj6 = option5.getType();
        boolean boolean8 = option5.equals((java.lang.Object) 0);
        org.apache.commons.cli.Options options9 = options0.addOption(option5);
        java.lang.String str11 = option5.getValue("hi!");
        java.util.List<java.lang.String> strList12 = option5.getValuesList();
        int int13 = option5.getArgs();
        org.apache.commons.cli.CommandLine.Builder builder14 = new org.apache.commons.cli.CommandLine.Builder();
        org.apache.commons.cli.CommandLine commandLine15 = builder14.build();
        org.apache.commons.cli.CommandLine commandLine16 = builder14.build();
        org.apache.commons.cli.CommandLine.Builder builder18 = builder14.addArg("[ option:  hi!  ::  :: class java.lang.String ]");
        boolean boolean19 = option5.equals((java.lang.Object) builder18);
        org.apache.commons.cli.CommandLine commandLine20 = builder18.build();
        java.lang.Object obj22 = commandLine20.getParsedOptionValue('\000');
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "class java.lang.String");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(commandLine15);
        org.junit.Assert.assertNotNull(commandLine16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(commandLine20);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("", true, "[ option:  hi!  ::  :: class java.lang.String ]");
        char char4 = option3.getValueSeparator();
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        org.apache.commons.cli.DefaultParser defaultParser1 = new org.apache.commons.cli.DefaultParser(false);
        org.apache.commons.cli.Options options2 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.DefaultParser defaultParser3 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options4 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option9 = new org.apache.commons.cli.Option("", "hi!", false, "");
        java.lang.Object obj10 = option9.getType();
        boolean boolean12 = option9.equals((java.lang.Object) 0);
        org.apache.commons.cli.Options options13 = options4.addOption(option9);
        org.apache.commons.cli.DefaultParser defaultParser14 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options15 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray22 = new java.lang.String[] { "org.apache.commons.cli.UnrecognizedOptionException: hi!", "hi!", "org.apache.commons.cli.UnrecognizedOptionException: hi!", "hi!", "", "org.apache.commons.cli.UnrecognizedOptionException: hi!" };
        java.util.Properties properties23 = null;
        org.apache.commons.cli.CommandLine commandLine24 = defaultParser14.parse(options15, strArray22, properties23);
        org.apache.commons.cli.CommandLine commandLine25 = defaultParser3.parse(options4, strArray22);
        org.apache.commons.cli.DefaultParser defaultParser26 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options27 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray34 = new java.lang.String[] { "org.apache.commons.cli.UnrecognizedOptionException: hi!", "hi!", "org.apache.commons.cli.UnrecognizedOptionException: hi!", "hi!", "", "org.apache.commons.cli.UnrecognizedOptionException: hi!" };
        java.util.Properties properties35 = null;
        org.apache.commons.cli.CommandLine commandLine36 = defaultParser26.parse(options27, strArray34, properties35);
        java.lang.String str38 = commandLine36.getOptionValue("hi!");
        java.lang.Object obj40 = commandLine36.getParsedOptionValue("");
        java.lang.String[] strArray42 = commandLine36.getOptionValues('4');
        java.lang.String[] strArray43 = commandLine36.getArgs();
        org.apache.commons.cli.Option option48 = new org.apache.commons.cli.Option("", "hi!", false, "");
        java.lang.Object obj49 = option48.getType();
        java.util.Properties properties50 = commandLine36.getOptionProperties(option48);
        org.apache.commons.cli.CommandLine commandLine52 = defaultParser1.parse(options2, strArray22, properties50, true);
        org.apache.commons.cli.Options options53 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.DefaultParser defaultParser54 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options55 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray62 = new java.lang.String[] { "org.apache.commons.cli.UnrecognizedOptionException: hi!", "hi!", "org.apache.commons.cli.UnrecognizedOptionException: hi!", "hi!", "", "org.apache.commons.cli.UnrecognizedOptionException: hi!" };
        java.util.Properties properties63 = null;
        org.apache.commons.cli.CommandLine commandLine64 = defaultParser54.parse(options55, strArray62, properties63);
        java.util.List<java.lang.String> strList65 = commandLine64.getArgList();
        java.lang.String str67 = commandLine64.getOptionValue("[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        java.lang.String str69 = commandLine64.getOptionValue(' ');
        boolean boolean71 = commandLine64.hasOption('a');
        java.lang.String[] strArray73 = commandLine64.getOptionValues("org.apache.commons.cli.UnrecognizedOptionException: hi!");
        java.lang.String[] strArray74 = commandLine64.getArgs();
        org.apache.commons.cli.CommandLine commandLine76 = defaultParser1.parse(options53, strArray74, false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "class java.lang.String");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(commandLine24);
        org.junit.Assert.assertNotNull(commandLine25);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(commandLine36);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(strArray42);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertEquals(obj49.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj49), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj49), "class java.lang.String");
        org.junit.Assert.assertNotNull(properties50);
        org.junit.Assert.assertNotNull(commandLine52);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(commandLine64);
        org.junit.Assert.assertNotNull(strList65);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNull(strArray73);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertNotNull(commandLine76);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "hi!", false, "");
        java.lang.Object obj5 = option4.getType();
        boolean boolean7 = option4.equals((java.lang.Object) 0);
        option4.setArgName("");
        java.lang.String[] strArray10 = option4.getValues();
        java.lang.Object obj11 = option4.getType();
        org.apache.commons.cli.DefaultParser defaultParser12 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options13 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray20 = new java.lang.String[] { "org.apache.commons.cli.UnrecognizedOptionException: hi!", "hi!", "org.apache.commons.cli.UnrecognizedOptionException: hi!", "hi!", "", "org.apache.commons.cli.UnrecognizedOptionException: hi!" };
        java.util.Properties properties21 = null;
        org.apache.commons.cli.CommandLine commandLine22 = defaultParser12.parse(options13, strArray20, properties21);
        boolean boolean24 = commandLine22.hasOption("hi!");
        java.util.List<java.lang.String> strList25 = commandLine22.getArgList();
        java.lang.String str28 = commandLine22.getOptionValue('\000', "[ option:  hi!  ::  :: class java.lang.String ]");
        boolean boolean29 = option4.equals((java.lang.Object) str28);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "class java.lang.String");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "class java.lang.String");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(commandLine22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[ option:  hi!  ::  :: class java.lang.String ]" + "'", str28, "[ option:  hi!  ::  :: class java.lang.String ]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        org.apache.commons.cli.DefaultParser defaultParser1 = new org.apache.commons.cli.DefaultParser(false);
        org.apache.commons.cli.DefaultParser defaultParser2 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option8 = new org.apache.commons.cli.Option("", "hi!", false, "");
        java.lang.Object obj9 = option8.getType();
        boolean boolean11 = option8.equals((java.lang.Object) 0);
        org.apache.commons.cli.Options options12 = options3.addOption(option8);
        org.apache.commons.cli.DefaultParser defaultParser13 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options14 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray21 = new java.lang.String[] { "org.apache.commons.cli.UnrecognizedOptionException: hi!", "hi!", "org.apache.commons.cli.UnrecognizedOptionException: hi!", "hi!", "", "org.apache.commons.cli.UnrecognizedOptionException: hi!" };
        java.util.Properties properties22 = null;
        org.apache.commons.cli.CommandLine commandLine23 = defaultParser13.parse(options14, strArray21, properties22);
        org.apache.commons.cli.CommandLine commandLine24 = defaultParser2.parse(options3, strArray21);
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "hi!" };
        org.apache.commons.cli.CommandLine commandLine29 = defaultParser1.parse(options3, strArray27, false);
        org.apache.commons.cli.Option option34 = new org.apache.commons.cli.Option("", "hi!", false, "");
        java.lang.Object obj35 = option34.getType();
        java.lang.String str37 = option34.getValue(10);
        java.lang.String str39 = option34.getValue((int) '#');
        boolean boolean40 = option34.hasArgs();
        option34.setRequired(true);
        java.lang.String str43 = option34.getArgName();
        java.lang.Object obj44 = option34.getType();
        java.lang.String str45 = commandLine29.getOptionValue(option34);
        option34.setLongOpt("[- ]");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "class java.lang.String");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(commandLine23);
        org.junit.Assert.assertNotNull(commandLine24);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(commandLine29);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertEquals(obj35.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj35), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj35), "class java.lang.String");
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertEquals(obj44.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj44), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj44), "class java.lang.String");
        org.junit.Assert.assertNull(str45);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray8 = new java.lang.String[] { "org.apache.commons.cli.UnrecognizedOptionException: hi!", "hi!", "org.apache.commons.cli.UnrecognizedOptionException: hi!", "hi!", "", "org.apache.commons.cli.UnrecognizedOptionException: hi!" };
        java.util.Properties properties9 = null;
        org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.parse(options1, strArray8, properties9);
        java.lang.String str12 = commandLine10.getOptionValue("hi!");
        java.lang.Object obj14 = commandLine10.getParsedOptionValue("");
        java.lang.String[] strArray16 = commandLine10.getOptionValues('4');
        java.lang.String str18 = commandLine10.getOptionValue("[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options19 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option24 = new org.apache.commons.cli.Option("", "hi!", false, "");
        java.lang.Object obj25 = option24.getType();
        boolean boolean27 = option24.equals((java.lang.Object) 0);
        org.apache.commons.cli.Options options28 = options19.addOption(option24);
        org.apache.commons.cli.OptionGroup optionGroup29 = new org.apache.commons.cli.OptionGroup();
        org.apache.commons.cli.Options options30 = options28.addOptionGroup(optionGroup29);
        org.apache.commons.cli.Option option35 = new org.apache.commons.cli.Option("", "hi!", false, "");
        java.lang.Object obj36 = option35.getType();
        boolean boolean38 = option35.equals((java.lang.Object) 0);
        boolean boolean39 = option35.hasLongOpt();
        org.apache.commons.cli.Options options40 = options28.addOption(option35);
        java.lang.Object obj41 = option35.clone();
        java.lang.String str43 = commandLine10.getOptionValue(option35, "hi!");
        org.apache.commons.cli.DefaultParser defaultParser44 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options45 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray52 = new java.lang.String[] { "org.apache.commons.cli.UnrecognizedOptionException: hi!", "hi!", "org.apache.commons.cli.UnrecognizedOptionException: hi!", "hi!", "", "org.apache.commons.cli.UnrecognizedOptionException: hi!" };
        java.util.Properties properties53 = null;
        org.apache.commons.cli.CommandLine commandLine54 = defaultParser44.parse(options45, strArray52, properties53);
        java.lang.String str56 = commandLine54.getOptionValue("hi!");
        java.lang.Object obj58 = commandLine54.getParsedOptionValue("");
        java.lang.String[] strArray60 = commandLine54.getOptionValues('4');
        java.lang.String str62 = commandLine54.getOptionValue("[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Options options63 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option68 = new org.apache.commons.cli.Option("", "hi!", false, "");
        java.lang.Object obj69 = option68.getType();
        boolean boolean71 = option68.equals((java.lang.Object) 0);
        org.apache.commons.cli.Options options72 = options63.addOption(option68);
        org.apache.commons.cli.OptionGroup optionGroup73 = new org.apache.commons.cli.OptionGroup();
        org.apache.commons.cli.Options options74 = options72.addOptionGroup(optionGroup73);
        org.apache.commons.cli.Option option79 = new org.apache.commons.cli.Option("", "hi!", false, "");
        java.lang.Object obj80 = option79.getType();
        boolean boolean82 = option79.equals((java.lang.Object) 0);
        boolean boolean83 = option79.hasLongOpt();
        org.apache.commons.cli.Options options84 = options72.addOption(option79);
        java.lang.Object obj85 = option79.clone();
        java.lang.String str87 = commandLine54.getOptionValue(option79, "hi!");
        java.lang.Object obj88 = commandLine10.getParsedOptionValue(option79);
        option79.setValueSeparator('#');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(commandLine10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "class java.lang.String");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(options28);
        org.junit.Assert.assertNotNull(options30);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertEquals(obj36.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj36), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj36), "class java.lang.String");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(options40);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertEquals(obj41.toString(), "[ option:  hi!  ::  :: class java.lang.String ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj41), "[ option:  hi!  ::  :: class java.lang.String ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj41), "[ option:  hi!  ::  :: class java.lang.String ]");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(commandLine54);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(strArray60);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNotNull(obj69);
        org.junit.Assert.assertEquals(obj69.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj69), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj69), "class java.lang.String");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(options72);
        org.junit.Assert.assertNotNull(options74);
        org.junit.Assert.assertNotNull(obj80);
        org.junit.Assert.assertEquals(obj80.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj80), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj80), "class java.lang.String");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(options84);
        org.junit.Assert.assertNotNull(obj85);
        org.junit.Assert.assertEquals(obj85.toString(), "[ option:  hi!  ::  :: class java.lang.String ]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj85), "[ option:  hi!  ::  :: class java.lang.String ]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj85), "[ option:  hi!  ::  :: class java.lang.String ]");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "hi!" + "'", str87, "hi!");
        org.junit.Assert.assertNull(obj88);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option6 = new org.apache.commons.cli.Option("", "hi!", false, "");
        java.lang.Object obj7 = option6.getType();
        boolean boolean9 = option6.equals((java.lang.Object) 0);
        org.apache.commons.cli.Options options10 = options1.addOption(option6);
        org.apache.commons.cli.OptionGroup optionGroup11 = new org.apache.commons.cli.OptionGroup();
        org.apache.commons.cli.Options options12 = options10.addOptionGroup(optionGroup11);
        java.lang.String str13 = options10.toString();
        org.apache.commons.cli.Option option18 = new org.apache.commons.cli.Option("", "hi!", false, "");
        java.lang.Object obj19 = option18.getType();
        java.lang.String str20 = option18.getArgName();
        boolean boolean21 = option18.hasArgName();
        boolean boolean22 = option18.hasArg();
        org.apache.commons.cli.OptionGroup optionGroup23 = options10.getOptionGroup(option18);
        org.apache.commons.cli.DefaultParser defaultParser24 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options25 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray32 = new java.lang.String[] { "org.apache.commons.cli.UnrecognizedOptionException: hi!", "hi!", "org.apache.commons.cli.UnrecognizedOptionException: hi!", "hi!", "", "org.apache.commons.cli.UnrecognizedOptionException: hi!" };
        java.util.Properties properties33 = null;
        org.apache.commons.cli.CommandLine commandLine34 = defaultParser24.parse(options25, strArray32, properties33);
        org.apache.commons.cli.CommandLine commandLine36 = defaultParser0.parse(options10, strArray32, true);
        org.apache.commons.cli.Options options40 = options10.addOption("", false, "hi!");
        org.apache.commons.cli.Options options43 = options10.addOption("", "[ option:  hi!  ::  :: class java.lang.String ]");
        org.apache.commons.cli.Option option45 = options10.getOption("org.apache.commons.cli.MissingOptionException: org.apache.commons.cli.MissingOptionException: Missing required options: ");
        java.lang.String str46 = options10.toString();
        boolean boolean48 = options10.hasShortOption("[ Options: [ short {=[ option:   :: org.apache.commons.cli.MissingOptionException: Missing required options:  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.apache.commons.cli.Option option53 = new org.apache.commons.cli.Option("", "hi!", false, "");
        java.lang.Object obj54 = option53.getType();
        boolean boolean56 = option53.equals((java.lang.Object) 0);
        option53.setDescription("org.apache.commons.cli.MissingOptionException: Missing required options: ");
        org.apache.commons.cli.Options options59 = options10.addOption(option53);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "class java.lang.String");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]" + "'", str13, "[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "class java.lang.String");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(optionGroup23);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(commandLine34);
        org.junit.Assert.assertNotNull(commandLine36);
        org.junit.Assert.assertNotNull(options40);
        org.junit.Assert.assertNotNull(options43);
        org.junit.Assert.assertNull(option45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "[ Options: [ short {=[ option:   :: [ option:  hi!  ::  :: class java.lang.String ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]" + "'", str46, "[ Options: [ short {=[ option:   :: [ option:  hi!  ::  :: class java.lang.String ] :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertEquals(obj54.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj54), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj54), "class java.lang.String");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(options59);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", "hi!", false, "");
        java.lang.Object obj6 = option5.getType();
        boolean boolean8 = option5.equals((java.lang.Object) 0);
        org.apache.commons.cli.Options options9 = options0.addOption(option5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options13 = options9.addOption("[ Options: [ short {=[ option:  org.apache.commons.cli.UnrecognizedOptionException: hi!  [ARG] :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], org.apache.commons.cli.UnrecognizedOptionException: hi!=[ option:  org.apache.commons.cli.UnrecognizedOptionException: hi!  [ARG] :: hi! :: class java.lang.String ]} ]", true, "org.apache.commons.cli.ParseException: []");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ Options: [ short {=[ option:  org.apache.commons.cli.UnrecognizedOptionException: hi!  [ARG] :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ], org.apache.commons.cli.UnrecognizedOptionException: hi!=[ option:  org.apache.commons.cli.UnrecognizedOptionException: hi!  [ARG] :: hi! :: class java.lang.String ]} ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "class java.lang.String");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", "hi!", false, "");
        java.lang.Object obj6 = option5.getType();
        boolean boolean8 = option5.equals((java.lang.Object) 0);
        org.apache.commons.cli.Options options9 = options0.addOption(option5);
        org.apache.commons.cli.OptionGroup optionGroup10 = new org.apache.commons.cli.OptionGroup();
        org.apache.commons.cli.Options options11 = options9.addOptionGroup(optionGroup10);
        org.apache.commons.cli.Option option16 = new org.apache.commons.cli.Option("", "hi!", false, "");
        java.lang.Object obj17 = option16.getType();
        boolean boolean19 = option16.equals((java.lang.Object) 0);
        boolean boolean20 = option16.hasLongOpt();
        org.apache.commons.cli.Options options21 = options9.addOption(option16);
        org.apache.commons.cli.DefaultParser defaultParser22 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options23 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray30 = new java.lang.String[] { "org.apache.commons.cli.UnrecognizedOptionException: hi!", "hi!", "org.apache.commons.cli.UnrecognizedOptionException: hi!", "hi!", "", "org.apache.commons.cli.UnrecognizedOptionException: hi!" };
        java.util.Properties properties31 = null;
        org.apache.commons.cli.CommandLine commandLine32 = defaultParser22.parse(options23, strArray30, properties31);
        java.lang.String str34 = commandLine32.getOptionValue("hi!");
        java.lang.Object obj36 = commandLine32.getParsedOptionValue("");
        java.lang.String[] strArray38 = commandLine32.getOptionValues('4');
        java.lang.String[] strArray39 = commandLine32.getArgs();
        org.apache.commons.cli.Option option44 = new org.apache.commons.cli.Option("", "hi!", false, "");
        java.lang.Object obj45 = option44.getType();
        java.util.Properties properties46 = commandLine32.getOptionProperties(option44);
        org.apache.commons.cli.Options options47 = options9.addOption(option44);
        org.apache.commons.cli.Option option52 = new org.apache.commons.cli.Option("", "hi!", false, "");
        java.lang.Object obj53 = option52.getType();
        boolean boolean55 = option52.equals((java.lang.Object) 0);
        option52.setValueSeparator(' ');
        java.lang.String str58 = option52.getArgName();
        boolean boolean59 = option52.isRequired();
        org.apache.commons.cli.Options options60 = options9.addOption(option52);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "class java.lang.String");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "class java.lang.String");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(options21);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(commandLine32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(strArray38);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertEquals(obj45.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj45), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj45), "class java.lang.String");
        org.junit.Assert.assertNotNull(properties46);
        org.junit.Assert.assertNotNull(options47);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertEquals(obj53.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj53), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj53), "class java.lang.String");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(options60);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", "hi!", false, "");
        java.lang.Object obj6 = option5.getType();
        boolean boolean8 = option5.equals((java.lang.Object) 0);
        org.apache.commons.cli.Options options9 = options0.addOption(option5);
        org.apache.commons.cli.OptionGroup optionGroup10 = new org.apache.commons.cli.OptionGroup();
        org.apache.commons.cli.Options options11 = options9.addOptionGroup(optionGroup10);
        org.apache.commons.cli.Option option16 = new org.apache.commons.cli.Option("", "hi!", false, "");
        java.lang.Object obj17 = option16.getType();
        boolean boolean19 = option16.equals((java.lang.Object) 0);
        boolean boolean20 = option16.hasLongOpt();
        org.apache.commons.cli.Options options21 = options9.addOption(option16);
        org.apache.commons.cli.DefaultParser defaultParser22 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options23 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray30 = new java.lang.String[] { "org.apache.commons.cli.UnrecognizedOptionException: hi!", "hi!", "org.apache.commons.cli.UnrecognizedOptionException: hi!", "hi!", "", "org.apache.commons.cli.UnrecognizedOptionException: hi!" };
        java.util.Properties properties31 = null;
        org.apache.commons.cli.CommandLine commandLine32 = defaultParser22.parse(options23, strArray30, properties31);
        java.lang.String str34 = commandLine32.getOptionValue("hi!");
        java.lang.Object obj36 = commandLine32.getParsedOptionValue("");
        java.lang.String[] strArray38 = commandLine32.getOptionValues('4');
        java.lang.String[] strArray39 = commandLine32.getArgs();
        org.apache.commons.cli.Option option44 = new org.apache.commons.cli.Option("", "hi!", false, "");
        java.lang.Object obj45 = option44.getType();
        java.util.Properties properties46 = commandLine32.getOptionProperties(option44);
        org.apache.commons.cli.Options options47 = options9.addOption(option44);
        org.apache.commons.cli.Options options52 = options47.addRequiredOption("", "org.apache.commons.cli.UnrecognizedOptionException: hi!", true, "hi!");
        boolean boolean54 = options52.hasLongOption("[]");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "class java.lang.String");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "class java.lang.String");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(options21);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(commandLine32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(strArray38);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertEquals(obj45.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj45), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj45), "class java.lang.String");
        org.junit.Assert.assertNotNull(properties46);
        org.junit.Assert.assertNotNull(options47);
        org.junit.Assert.assertNotNull(options52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.DefaultParser defaultParser2 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options3 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option8 = new org.apache.commons.cli.Option("", "hi!", false, "");
        java.lang.Object obj9 = option8.getType();
        boolean boolean11 = option8.equals((java.lang.Object) 0);
        org.apache.commons.cli.Options options12 = options3.addOption(option8);
        org.apache.commons.cli.DefaultParser defaultParser13 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options14 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray21 = new java.lang.String[] { "org.apache.commons.cli.UnrecognizedOptionException: hi!", "hi!", "org.apache.commons.cli.UnrecognizedOptionException: hi!", "hi!", "", "org.apache.commons.cli.UnrecognizedOptionException: hi!" };
        java.util.Properties properties22 = null;
        org.apache.commons.cli.CommandLine commandLine23 = defaultParser13.parse(options14, strArray21, properties22);
        org.apache.commons.cli.CommandLine commandLine24 = defaultParser2.parse(options3, strArray21);
        org.apache.commons.cli.CommandLine commandLine26 = defaultParser0.parse(options1, strArray21, true);
        org.apache.commons.cli.Options options27 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option32 = new org.apache.commons.cli.Option("", "hi!", false, "");
        java.lang.Object obj33 = option32.getType();
        boolean boolean35 = option32.equals((java.lang.Object) 0);
        org.apache.commons.cli.Options options36 = options27.addOption(option32);
        boolean boolean38 = options36.hasLongOption("org.apache.commons.cli.UnrecognizedOptionException: hi!");
        java.lang.String str39 = options36.toString();
        org.apache.commons.cli.DefaultParser defaultParser41 = new org.apache.commons.cli.DefaultParser(false);
        org.apache.commons.cli.DefaultParser defaultParser42 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options43 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option48 = new org.apache.commons.cli.Option("", "hi!", false, "");
        java.lang.Object obj49 = option48.getType();
        boolean boolean51 = option48.equals((java.lang.Object) 0);
        org.apache.commons.cli.Options options52 = options43.addOption(option48);
        org.apache.commons.cli.DefaultParser defaultParser53 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options54 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray61 = new java.lang.String[] { "org.apache.commons.cli.UnrecognizedOptionException: hi!", "hi!", "org.apache.commons.cli.UnrecognizedOptionException: hi!", "hi!", "", "org.apache.commons.cli.UnrecognizedOptionException: hi!" };
        java.util.Properties properties62 = null;
        org.apache.commons.cli.CommandLine commandLine63 = defaultParser53.parse(options54, strArray61, properties62);
        org.apache.commons.cli.CommandLine commandLine64 = defaultParser42.parse(options43, strArray61);
        java.lang.String[] strArray67 = new java.lang.String[] { "hi!", "hi!" };
        org.apache.commons.cli.CommandLine commandLine69 = defaultParser41.parse(options43, strArray67, false);
        org.apache.commons.cli.CommandLine commandLine70 = defaultParser0.parse(options36, strArray67);
        java.util.Iterator<org.apache.commons.cli.Option> optionItor71 = commandLine70.iterator();
        java.lang.Class<?> wildcardClass72 = commandLine70.getClass();
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "class java.lang.String");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(commandLine23);
        org.junit.Assert.assertNotNull(commandLine24);
        org.junit.Assert.assertNotNull(commandLine26);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertEquals(obj33.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj33), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj33), "class java.lang.String");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(options36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]" + "'", str39, "[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertEquals(obj49.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj49), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj49), "class java.lang.String");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(options52);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNotNull(commandLine63);
        org.junit.Assert.assertNotNull(commandLine64);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNotNull(commandLine69);
        org.junit.Assert.assertNotNull(commandLine70);
        org.junit.Assert.assertNotNull(optionItor71);
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        org.apache.commons.cli.Option option3 = new org.apache.commons.cli.Option("", true, "org.apache.commons.cli.MissingOptionException: org.apache.commons.cli.MissingOptionException: org.apache.commons.cli.MissingOptionException: Missing required options: ");
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser5 = builder4.build();
        org.apache.commons.cli.DefaultParser.Builder builder7 = builder4.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(defaultParser5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        org.apache.commons.cli.Option option4 = new org.apache.commons.cli.Option("", "hi!", false, "");
        java.lang.Object obj5 = option4.getType();
        java.lang.String str7 = option4.getValue(10);
        java.lang.String str9 = option4.getValue((int) '#');
        boolean boolean10 = option4.hasArgs();
        option4.setLongOpt("org.apache.commons.cli.MissingOptionException: Missing required options: ");
        java.lang.String str14 = option4.getValue((int) (short) 0);
        java.lang.String str15 = option4.getDescription();
        option4.setOptionalArg(true);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "class java.lang.String");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        org.apache.commons.cli.AlreadySelectedException alreadySelectedException1 = new org.apache.commons.cli.AlreadySelectedException("org.apache.commons.cli.UnrecognizedOptionException: hi!");
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        org.apache.commons.cli.Option.Builder builder0 = org.apache.commons.cli.Option.builder();
        org.apache.commons.cli.Option.Builder builder2 = builder0.argName("[]");
        org.apache.commons.cli.Option.Builder builder3 = builder0.hasArg();
        org.apache.commons.cli.Option.Builder builder5 = builder0.valueSeparator(' ');
        org.apache.commons.cli.Option.Builder builder7 = builder5.optionalArg(false);
        org.apache.commons.cli.Option.Builder builder9 = builder5.longOpt("hi!");
        org.apache.commons.cli.Option.Builder builder11 = builder5.hasArg(true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray8 = new java.lang.String[] { "org.apache.commons.cli.UnrecognizedOptionException: hi!", "hi!", "org.apache.commons.cli.UnrecognizedOptionException: hi!", "hi!", "", "org.apache.commons.cli.UnrecognizedOptionException: hi!" };
        java.util.Properties properties9 = null;
        org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.parse(options1, strArray8, properties9);
        org.apache.commons.cli.Options options11 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option16 = new org.apache.commons.cli.Option("", "hi!", false, "");
        java.lang.Object obj17 = option16.getType();
        boolean boolean19 = option16.equals((java.lang.Object) 0);
        org.apache.commons.cli.Options options20 = options11.addOption(option16);
        org.apache.commons.cli.OptionGroup optionGroup21 = new org.apache.commons.cli.OptionGroup();
        org.apache.commons.cli.Options options22 = options20.addOptionGroup(optionGroup21);
        org.apache.commons.cli.Option option27 = new org.apache.commons.cli.Option("", "hi!", false, "");
        java.lang.Object obj28 = option27.getType();
        boolean boolean30 = option27.equals((java.lang.Object) 0);
        boolean boolean31 = option27.hasLongOpt();
        org.apache.commons.cli.Options options32 = options20.addOption(option27);
        option27.setRequired(false);
        java.lang.String[] strArray35 = option27.getValues();
        org.apache.commons.cli.Options options36 = options1.addOption(option27);
        org.apache.commons.cli.Option option38 = options36.getOption("[ Options: [ short {=[ option:   :: org.apache.commons.cli.MissingOptionException: Missing required options:  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        java.util.List<java.lang.String> strList40 = options36.getMatchingOptions("org.apache.commons.cli.UnrecognizedOptionException: hi!");
        java.util.List<java.lang.String> strList42 = options36.getMatchingOptions("[ Options: [ short {=[ option:   :: org.apache.commons.cli.MissingOptionException: Missing required options:  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        boolean boolean44 = options36.hasLongOption("org.apache.commons.cli.UnrecognizedOptionException: hi!");
        org.apache.commons.cli.Option option45 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup46 = options36.getOptionGroup(option45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getKey()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(commandLine10);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "class java.lang.String");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(options20);
        org.junit.Assert.assertNotNull(options22);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "class java.lang.String");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(options32);
        org.junit.Assert.assertNull(strArray35);
        org.junit.Assert.assertNotNull(options36);
        org.junit.Assert.assertNull(option38);
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", "hi!", false, "");
        java.lang.Object obj6 = option5.getType();
        boolean boolean8 = option5.equals((java.lang.Object) 0);
        org.apache.commons.cli.Options options9 = options0.addOption(option5);
        org.apache.commons.cli.OptionGroup optionGroup10 = new org.apache.commons.cli.OptionGroup();
        org.apache.commons.cli.Options options11 = options9.addOptionGroup(optionGroup10);
        java.lang.String str12 = options9.toString();
        org.apache.commons.cli.Option option17 = new org.apache.commons.cli.Option("", "hi!", false, "");
        java.lang.Object obj18 = option17.getType();
        java.lang.String str19 = option17.getArgName();
        boolean boolean20 = option17.hasArgName();
        boolean boolean21 = option17.hasArg();
        org.apache.commons.cli.OptionGroup optionGroup22 = options9.getOptionGroup(option17);
        org.apache.commons.cli.Option option27 = new org.apache.commons.cli.Option("", "hi!", false, "");
        boolean boolean28 = option27.hasValueSeparator();
        org.apache.commons.cli.Options options29 = options9.addOption(option27);
        java.lang.String str30 = option27.getOpt();
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "class java.lang.String");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]" + "'", str12, "[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "class java.lang.String");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(optionGroup22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(options29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", "hi!", false, "");
        java.lang.Object obj6 = option5.getType();
        boolean boolean8 = option5.equals((java.lang.Object) 0);
        org.apache.commons.cli.Options options9 = options0.addOption(option5);
        org.apache.commons.cli.OptionGroup optionGroup10 = new org.apache.commons.cli.OptionGroup();
        org.apache.commons.cli.Options options11 = options9.addOptionGroup(optionGroup10);
        java.lang.String str12 = options9.toString();
        boolean boolean14 = options9.hasLongOption("org.apache.commons.cli.UnrecognizedOptionException: hi!");
        org.apache.commons.cli.Option option19 = new org.apache.commons.cli.Option("", "[ option:  hi!  ::  :: class java.lang.String ]", true, "org.apache.commons.cli.UnrecognizedOptionException: hi!");
        org.apache.commons.cli.Options options20 = options9.addOption(option19);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.Options options23 = options9.addOption("[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]", "[ Options: [ short {=[ option:   :: hi! :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The option '[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]' contains an illegal character : '['");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "class java.lang.String");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]" + "'", str12, "[ Options: [ short {=[ option:  hi!  ::  :: class java.lang.String ]} ] [ long {hi!=[ option:  hi!  ::  :: class java.lang.String ]} ]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(options20);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray8 = new java.lang.String[] { "org.apache.commons.cli.UnrecognizedOptionException: hi!", "hi!", "org.apache.commons.cli.UnrecognizedOptionException: hi!", "hi!", "", "org.apache.commons.cli.UnrecognizedOptionException: hi!" };
        java.util.Properties properties9 = null;
        org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.parse(options1, strArray8, properties9);
        java.util.List<java.lang.String> strList11 = commandLine10.getArgList();
        java.lang.String str14 = commandLine10.getOptionValue('#', "org.apache.commons.cli.UnrecognizedOptionException: hi!");
        java.lang.String str17 = commandLine10.getOptionValue("hi!", "[ option:  hi!  ::  :: class java.lang.String ]");
        org.apache.commons.cli.Option option22 = new org.apache.commons.cli.Option("", "hi!", false, "");
        java.lang.Object obj23 = option22.getType();
        java.lang.String str24 = option22.getArgName();
        java.lang.String str25 = option22.getLongOpt();
        boolean boolean26 = commandLine10.hasOption(option22);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(commandLine10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.apache.commons.cli.UnrecognizedOptionException: hi!" + "'", str14, "org.apache.commons.cli.UnrecognizedOptionException: hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[ option:  hi!  ::  :: class java.lang.String ]" + "'", str17, "[ option:  hi!  ::  :: class java.lang.String ]");
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "class java.lang.String");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        org.apache.commons.cli.Options options0 = new org.apache.commons.cli.Options();
        org.apache.commons.cli.Option option5 = new org.apache.commons.cli.Option("", "hi!", false, "");
        java.lang.Object obj6 = option5.getType();
        boolean boolean8 = option5.equals((java.lang.Object) 0);
        org.apache.commons.cli.Options options9 = options0.addOption(option5);
        org.apache.commons.cli.OptionGroup optionGroup10 = new org.apache.commons.cli.OptionGroup();
        org.apache.commons.cli.Options options11 = options9.addOptionGroup(optionGroup10);
        org.apache.commons.cli.Option option16 = new org.apache.commons.cli.Option("", "hi!", false, "");
        java.lang.Object obj17 = option16.getType();
        boolean boolean19 = option16.equals((java.lang.Object) 0);
        boolean boolean20 = option16.hasLongOpt();
        org.apache.commons.cli.Options options21 = options9.addOption(option16);
        org.apache.commons.cli.DefaultParser defaultParser22 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options23 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray30 = new java.lang.String[] { "org.apache.commons.cli.UnrecognizedOptionException: hi!", "hi!", "org.apache.commons.cli.UnrecognizedOptionException: hi!", "hi!", "", "org.apache.commons.cli.UnrecognizedOptionException: hi!" };
        java.util.Properties properties31 = null;
        org.apache.commons.cli.CommandLine commandLine32 = defaultParser22.parse(options23, strArray30, properties31);
        java.lang.String str34 = commandLine32.getOptionValue("hi!");
        java.lang.Object obj36 = commandLine32.getParsedOptionValue("");
        java.lang.String[] strArray38 = commandLine32.getOptionValues('4');
        java.lang.String[] strArray39 = commandLine32.getArgs();
        org.apache.commons.cli.Option option44 = new org.apache.commons.cli.Option("", "hi!", false, "");
        java.lang.Object obj45 = option44.getType();
        java.util.Properties properties46 = commandLine32.getOptionProperties(option44);
        org.apache.commons.cli.Options options47 = options9.addOption(option44);
        org.apache.commons.cli.Option option52 = new org.apache.commons.cli.Option("", "hi!", false, "");
        org.apache.commons.cli.Options options53 = options9.addOption(option52);
        option52.setRequired(true);
        option52.setValueSeparator('#');
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "class java.lang.String");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "class java.lang.String");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(options21);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(commandLine32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(strArray38);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertEquals(obj45.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj45), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj45), "class java.lang.String");
        org.junit.Assert.assertNotNull(properties46);
        org.junit.Assert.assertNotNull(options47);
        org.junit.Assert.assertNotNull(options53);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray8 = new java.lang.String[] { "org.apache.commons.cli.UnrecognizedOptionException: hi!", "hi!", "org.apache.commons.cli.UnrecognizedOptionException: hi!", "hi!", "", "org.apache.commons.cli.UnrecognizedOptionException: hi!" };
        java.util.Properties properties9 = null;
        org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.parse(options1, strArray8, properties9);
        boolean boolean12 = commandLine10.hasOption("hi!");
        org.apache.commons.cli.Option option17 = new org.apache.commons.cli.Option("", "hi!", false, "");
        java.lang.Object obj18 = option17.getType();
        java.lang.String str19 = option17.getArgName();
        option17.setValueSeparator('#');
        java.lang.String[] strArray22 = commandLine10.getOptionValues(option17);
        java.lang.Object obj24 = commandLine10.getParsedOptionValue('4');
        java.util.Properties properties26 = commandLine10.getOptionProperties("");
        java.lang.String str29 = commandLine10.getOptionValue('\000', "[]");
        java.lang.String[] strArray31 = commandLine10.getOptionValues('4');
        java.util.List<java.lang.String> strList32 = commandLine10.getArgList();
        org.apache.commons.cli.DefaultParser defaultParser33 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options34 = new org.apache.commons.cli.Options();
        java.lang.String[] strArray41 = new java.lang.String[] { "org.apache.commons.cli.UnrecognizedOptionException: hi!", "hi!", "org.apache.commons.cli.UnrecognizedOptionException: hi!", "hi!", "", "org.apache.commons.cli.UnrecognizedOptionException: hi!" };
        java.util.Properties properties42 = null;
        org.apache.commons.cli.CommandLine commandLine43 = defaultParser33.parse(options34, strArray41, properties42);
        java.lang.String str45 = commandLine43.getOptionValue("hi!");
        java.lang.Object obj47 = commandLine43.getParsedOptionValue("");
        java.lang.String[] strArray49 = commandLine43.getOptionValues('4');
        java.lang.String[] strArray50 = commandLine43.getArgs();
        org.apache.commons.cli.Option option55 = new org.apache.commons.cli.Option("", "hi!", false, "");
        java.lang.Object obj56 = option55.getType();
        java.util.Properties properties57 = commandLine43.getOptionProperties(option55);
        boolean boolean58 = option55.hasArg();
        java.lang.String str59 = option55.getDescription();
        java.lang.Object obj60 = option55.getType();
        boolean boolean61 = commandLine10.hasOption(option55);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(commandLine10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "class java.lang.String");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(strArray22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "[]" + "'", str29, "[]");
        org.junit.Assert.assertNull(strArray31);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(commandLine43);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(strArray49);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertEquals(obj56.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj56), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj56), "class java.lang.String");
        org.junit.Assert.assertNotNull(properties57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertEquals(obj60.toString(), "class java.lang.String");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj60), "class java.lang.String");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj60), "class java.lang.String");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }
}

