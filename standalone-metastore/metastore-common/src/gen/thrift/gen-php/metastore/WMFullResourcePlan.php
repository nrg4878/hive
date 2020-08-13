<?php
namespace metastore;

/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
use Thrift\Base\TBase;
use Thrift\Type\TType;
use Thrift\Type\TMessageType;
use Thrift\Exception\TException;
use Thrift\Exception\TProtocolException;
use Thrift\Protocol\TProtocol;
use Thrift\Protocol\TBinaryProtocolAccelerated;
use Thrift\Exception\TApplicationException;

class WMFullResourcePlan
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'plan',
            'isRequired' => true,
            'type' => TType::STRUCT,
            'class' => '\metastore\WMResourcePlan',
        ),
        2 => array(
            'var' => 'pools',
            'isRequired' => true,
            'type' => TType::LST,
            'etype' => TType::STRUCT,
            'elem' => array(
                'type' => TType::STRUCT,
                'class' => '\metastore\WMPool',
                ),
        ),
        3 => array(
            'var' => 'mappings',
            'isRequired' => false,
            'type' => TType::LST,
            'etype' => TType::STRUCT,
            'elem' => array(
                'type' => TType::STRUCT,
                'class' => '\metastore\WMMapping',
                ),
        ),
        4 => array(
            'var' => 'triggers',
            'isRequired' => false,
            'type' => TType::LST,
            'etype' => TType::STRUCT,
            'elem' => array(
                'type' => TType::STRUCT,
                'class' => '\metastore\WMTrigger',
                ),
        ),
        5 => array(
            'var' => 'poolTriggers',
            'isRequired' => false,
            'type' => TType::LST,
            'etype' => TType::STRUCT,
            'elem' => array(
                'type' => TType::STRUCT,
                'class' => '\metastore\WMPoolTrigger',
                ),
        ),
    );

    /**
     * @var \metastore\WMResourcePlan
     */
    public $plan = null;
    /**
     * @var \metastore\WMPool[]
     */
    public $pools = null;
    /**
     * @var \metastore\WMMapping[]
     */
    public $mappings = null;
    /**
     * @var \metastore\WMTrigger[]
     */
    public $triggers = null;
    /**
     * @var \metastore\WMPoolTrigger[]
     */
    public $poolTriggers = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['plan'])) {
                $this->plan = $vals['plan'];
            }
            if (isset($vals['pools'])) {
                $this->pools = $vals['pools'];
            }
            if (isset($vals['mappings'])) {
                $this->mappings = $vals['mappings'];
            }
            if (isset($vals['triggers'])) {
                $this->triggers = $vals['triggers'];
            }
            if (isset($vals['poolTriggers'])) {
                $this->poolTriggers = $vals['poolTriggers'];
            }
        }
    }

    public function getName()
    {
        return 'WMFullResourcePlan';
    }


    public function read($input)
    {
        $xfer = 0;
        $fname = null;
        $ftype = 0;
        $fid = 0;
        $xfer += $input->readStructBegin($fname);
        while (true) {
            $xfer += $input->readFieldBegin($fname, $ftype, $fid);
            if ($ftype == TType::STOP) {
                break;
            }
            switch ($fid) {
                case 1:
                    if ($ftype == TType::STRUCT) {
                        $this->plan = new \metastore\WMResourcePlan();
                        $xfer += $this->plan->read($input);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::LST) {
                        $this->pools = array();
<<<<<<< HEAD
                        $_size938 = 0;
                        $_etype941 = 0;
                        $xfer += $input->readListBegin($_etype941, $_size938);
                        for ($_i942 = 0; $_i942 < $_size938; ++$_i942) {
                            $elem943 = null;
                            $elem943 = new \metastore\WMPool();
                            $xfer += $elem943->read($input);
                            $this->pools []= $elem943;
=======
                        $_size940 = 0;
                        $_etype943 = 0;
                        $xfer += $input->readListBegin($_etype943, $_size940);
                        for ($_i944 = 0; $_i944 < $_size940; ++$_i944) {
                            $elem945 = null;
                            $elem945 = new \metastore\WMPool();
                            $xfer += $elem945->read($input);
                            $this->pools []= $elem945;
>>>>>>> External metastore: clean after rebase
                        }
                        $xfer += $input->readListEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::LST) {
                        $this->mappings = array();
<<<<<<< HEAD
                        $_size944 = 0;
                        $_etype947 = 0;
                        $xfer += $input->readListBegin($_etype947, $_size944);
                        for ($_i948 = 0; $_i948 < $_size944; ++$_i948) {
                            $elem949 = null;
                            $elem949 = new \metastore\WMMapping();
                            $xfer += $elem949->read($input);
                            $this->mappings []= $elem949;
=======
                        $_size946 = 0;
                        $_etype949 = 0;
                        $xfer += $input->readListBegin($_etype949, $_size946);
                        for ($_i950 = 0; $_i950 < $_size946; ++$_i950) {
                            $elem951 = null;
                            $elem951 = new \metastore\WMMapping();
                            $xfer += $elem951->read($input);
                            $this->mappings []= $elem951;
>>>>>>> External metastore: clean after rebase
                        }
                        $xfer += $input->readListEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 4:
                    if ($ftype == TType::LST) {
                        $this->triggers = array();
<<<<<<< HEAD
                        $_size950 = 0;
                        $_etype953 = 0;
                        $xfer += $input->readListBegin($_etype953, $_size950);
                        for ($_i954 = 0; $_i954 < $_size950; ++$_i954) {
                            $elem955 = null;
                            $elem955 = new \metastore\WMTrigger();
                            $xfer += $elem955->read($input);
                            $this->triggers []= $elem955;
=======
                        $_size952 = 0;
                        $_etype955 = 0;
                        $xfer += $input->readListBegin($_etype955, $_size952);
                        for ($_i956 = 0; $_i956 < $_size952; ++$_i956) {
                            $elem957 = null;
                            $elem957 = new \metastore\WMTrigger();
                            $xfer += $elem957->read($input);
                            $this->triggers []= $elem957;
>>>>>>> External metastore: clean after rebase
                        }
                        $xfer += $input->readListEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 5:
                    if ($ftype == TType::LST) {
                        $this->poolTriggers = array();
<<<<<<< HEAD
                        $_size956 = 0;
                        $_etype959 = 0;
                        $xfer += $input->readListBegin($_etype959, $_size956);
                        for ($_i960 = 0; $_i960 < $_size956; ++$_i960) {
                            $elem961 = null;
                            $elem961 = new \metastore\WMPoolTrigger();
                            $xfer += $elem961->read($input);
                            $this->poolTriggers []= $elem961;
=======
                        $_size958 = 0;
                        $_etype961 = 0;
                        $xfer += $input->readListBegin($_etype961, $_size958);
                        for ($_i962 = 0; $_i962 < $_size958; ++$_i962) {
                            $elem963 = null;
                            $elem963 = new \metastore\WMPoolTrigger();
                            $xfer += $elem963->read($input);
                            $this->poolTriggers []= $elem963;
>>>>>>> External metastore: clean after rebase
                        }
                        $xfer += $input->readListEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                default:
                    $xfer += $input->skip($ftype);
                    break;
            }
            $xfer += $input->readFieldEnd();
        }
        $xfer += $input->readStructEnd();
        return $xfer;
    }

    public function write($output)
    {
        $xfer = 0;
        $xfer += $output->writeStructBegin('WMFullResourcePlan');
        if ($this->plan !== null) {
            if (!is_object($this->plan)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('plan', TType::STRUCT, 1);
            $xfer += $this->plan->write($output);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->pools !== null) {
            if (!is_array($this->pools)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('pools', TType::LST, 2);
            $output->writeListBegin(TType::STRUCT, count($this->pools));
<<<<<<< HEAD
            foreach ($this->pools as $iter962) {
                $xfer += $iter962->write($output);
=======
            foreach ($this->pools as $iter964) {
                $xfer += $iter964->write($output);
>>>>>>> External metastore: clean after rebase
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->mappings !== null) {
            if (!is_array($this->mappings)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('mappings', TType::LST, 3);
            $output->writeListBegin(TType::STRUCT, count($this->mappings));
<<<<<<< HEAD
            foreach ($this->mappings as $iter963) {
                $xfer += $iter963->write($output);
=======
            foreach ($this->mappings as $iter965) {
                $xfer += $iter965->write($output);
>>>>>>> External metastore: clean after rebase
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->triggers !== null) {
            if (!is_array($this->triggers)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('triggers', TType::LST, 4);
            $output->writeListBegin(TType::STRUCT, count($this->triggers));
<<<<<<< HEAD
            foreach ($this->triggers as $iter964) {
                $xfer += $iter964->write($output);
=======
            foreach ($this->triggers as $iter966) {
                $xfer += $iter966->write($output);
>>>>>>> External metastore: clean after rebase
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->poolTriggers !== null) {
            if (!is_array($this->poolTriggers)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('poolTriggers', TType::LST, 5);
            $output->writeListBegin(TType::STRUCT, count($this->poolTriggers));
<<<<<<< HEAD
            foreach ($this->poolTriggers as $iter965) {
                $xfer += $iter965->write($output);
=======
            foreach ($this->poolTriggers as $iter967) {
                $xfer += $iter967->write($output);
>>>>>>> External metastore: clean after rebase
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
