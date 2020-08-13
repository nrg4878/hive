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

class GetOpenTxnsRequest
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'excludeTxnTypes',
            'isRequired' => false,
            'type' => TType::LST,
            'etype' => TType::I32,
            'elem' => array(
                'type' => TType::I32,
                ),
        ),
    );

    /**
     * @var int[]
     */
    public $excludeTxnTypes = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['excludeTxnTypes'])) {
                $this->excludeTxnTypes = $vals['excludeTxnTypes'];
            }
        }
    }

    public function getName()
    {
        return 'GetOpenTxnsRequest';
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
                    if ($ftype == TType::LST) {
                        $this->excludeTxnTypes = array();
                        $_size1194 = 0;
                        $_etype1197 = 0;
                        $xfer += $input->readListBegin($_etype1197, $_size1194);
                        for ($_i1198 = 0; $_i1198 < $_size1194; ++$_i1198) {
                            $elem1199 = null;
                            $xfer += $input->readI32($elem1199);
                            $this->excludeTxnTypes []= $elem1199;
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
        $xfer += $output->writeStructBegin('GetOpenTxnsRequest');
        if ($this->excludeTxnTypes !== null) {
            if (!is_array($this->excludeTxnTypes)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('excludeTxnTypes', TType::LST, 1);
            $output->writeListBegin(TType::I32, count($this->excludeTxnTypes));
            foreach ($this->excludeTxnTypes as $iter1200) {
                $xfer += $output->writeI32($iter1200);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
